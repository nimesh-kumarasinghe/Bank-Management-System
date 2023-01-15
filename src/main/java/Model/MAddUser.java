/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MAddUser {
    public void saveUserData(String user_type,String user_id,String full_name,String name_with_i,String dob,String age,String nic,String gender,String address,String tp_number,String email,String password)
    {   try
        {
        DatabaseConnection con = new DatabaseConnection();
        Statement st= con.createDbConnection().createStatement();
        int count=st.executeUpdate("insert into "+user_type+" values('"+user_id+"','"+full_name+"','"+name_with_i+"','"+nic+"','"+gender+"','"+dob+"',"+age+",'"+address+"',"+tp_number+",'"+email+"','"+password+"')");
        if(count>0)
        {   JOptionPane.showMessageDialog(null,"User Created Successfully !!");
        }
        else
        {   JOptionPane.showMessageDialog(null,"Please Check Again !! ");
        }
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    public String getNextUserID(String user_type)
    {   ResultSet rs = null;
        String column_name="";
        if(user_type == "admin")
        {   column_name = "AdminId";
        }
        else if(user_type == "staff")
        {   column_name = "StaffID";
        }
        try
        {   DatabaseConnection con = new DatabaseConnection();
            Statement st=con.createDbConnection().createStatement();
            rs = st.executeQuery("select MAX("+column_name+") from "+user_type+" ");
            rs.next();
            rs.getString("MAX("+column_name+")");
            if(rs.getString("MAX("+column_name+")") == null)
            {   if(user_type == "admin")
                {   return "A001";
                }
                else if(user_type == "staff")
                {   return "S001";
                }
            }
            else
            {   Long id = Long.parseLong(rs.getString("MAX("+column_name+")").substring(1,rs.getString("MAX("+column_name+")").length()));
                id++;
                if(user_type == "admin")
                {   return "A" + String.format("%03d", id);
                }
                else if(user_type == "staff")
                {   return "S" + String.format("%03d", id);
                }
            }
            
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return null;
    }
}
