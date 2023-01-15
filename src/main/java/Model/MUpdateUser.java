/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MUpdateUser {
    public void udateAdminData(String user_type,String userid,String fname,String ininame,String nic,String gender,String dob,String age, String address,String tpno,String email,String password)
    {   String query="";
        if(user_type=="admin")
        {
            query="update admin set AFullName='"+fname+"',AIniName='"+ininame+"',ANIC='"+nic+"',AGender='"+gender+"',ADOB='"+dob+"',AdAge="+age+",AdminAddress='"+address+"',AdTP="+tpno+",AdEmail='"+email+"',AdminPassword='"+password+"' where AdminId='"+userid+"'";
        }
        else if(user_type=="staff")
        {
            query="update staff set SFullname='"+fname+"',SIniName='"+ininame+"',SNIC='"+nic+"',SGender='"+gender+"',SDOB='"+dob+"',SAge="+age+",StaffAddress='"+address+"',StaffTP="+tpno+",StaffEmail='"+email+"',StaffPassword='"+password+"' where StaffID='"+userid+"'";
        }
        try
        {
            DatabaseConnection mycon = new DatabaseConnection();
            Statement st=mycon.createDbConnection().createStatement();
            int count=st.executeUpdate(query);
            if(count>0)
            {   JOptionPane.showMessageDialog(null,"Details are Updated Succssfull!!");
            }
            else
            {   JOptionPane.showMessageDialog(null,"Updated Unsuccessfull!!");
            }
        }
        catch(SQLException e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

        public ResultSet getData(String usertype,String userid)
        {
            String query="";
                    if(usertype=="admin")
                    {
                        query="select * from admin where AdminId='"+userid+"'";
                    }
                    else if(usertype=="staff")
                    {
                        query="select * from staff where StaffID='"+userid+"'";
                    }
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
            {   rs=st.executeQuery(query);
            }
            }
            catch(SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
            catch(Exception e)
            {   JOptionPane.showMessageDialog(null,e.getMessage());
            }
            return rs;


        }

    public ResultSet getData(String usertype, String userid, String userpassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
