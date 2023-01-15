/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.VNewPassword;
import View.VPasswordChange;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MResetPassword {
    public ResultSet getData(String usersid,String usersnic,String usersemail)
        {
                    String query="";

                        query="select * from staff where StaffID='"+usersid+"' and SNIC='"+usersnic+"' and StaffEmail='"+usersemail+"'";

            ResultSet rs=null;
            try
            {
            DatabaseConnection mycon = new DatabaseConnection();
            Statement st=mycon.createDbConnection().createStatement();
            rs=st.executeQuery(query);
            if(rs.next() == false)
            {   JOptionPane.showMessageDialog(null,"Invalid UserID","Error",0);
            }
            else
            {   
                VNewPassword newpw = new VNewPassword();
                newpw.show();
                VPasswordChange cpw = new VPasswordChange();
                cpw.dispose();
            }
            }
            catch(SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
            catch(Exception e)
            {   JOptionPane.showMessageDialog(null,e.getMessage());
            }
            return rs;
}}
