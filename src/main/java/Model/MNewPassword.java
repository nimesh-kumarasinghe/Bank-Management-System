/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MNewPassword {
    public void udatePassword(String newpassword)
    {   String query="update staff set StaffPassword='"+newpassword+"'";
        try
        {
            DatabaseConnection mycon = new DatabaseConnection();
            Statement st=mycon.createDbConnection().createStatement();
            int count=st.executeUpdate(query);
            if(count>0)
            {   JOptionPane.showMessageDialog(null,"Password Updated Succssfull!!");
            }
            else
            {   JOptionPane.showMessageDialog(null,"Password Updated Unsuccessfull!!");
            }
        }
        catch(SQLException e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
