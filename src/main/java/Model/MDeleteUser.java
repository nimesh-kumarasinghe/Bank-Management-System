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
public class MDeleteUser {
    public String col_selector(String type)
    {   String col_name="";
        if(type == "admin")
        {   col_name = "AdminId";
        }
        else if(type == "staff")
        {   col_name = "StaffID";
        }
        ResultSet rs = null;
        return col_name;
    }
    public ResultSet getUserInfo(String user_type,String user_id)
    {   String col_name= col_selector(user_type);
        ResultSet rs = null;
        try
        {   DatabaseConnection con = new DatabaseConnection();
            Statement st=con.createDbConnection().createStatement();
            rs = st.executeQuery("select * from "+user_type+" where "+col_name+"= '"+user_id+"' ");  
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rs;
    }
    public void deleteUser(String user_type,String user_id)
    {   String col_name=col_selector(user_type);
        try
        {
            DatabaseConnection con = new DatabaseConnection();
            Statement st= con.createDbConnection().createStatement();
            int count=st.executeUpdate("delete from "+user_type+" where "+col_name+"= '"+user_id+"' ");
            if(count>0)
            {   JOptionPane.showMessageDialog(null,"User Deleted Successfully !!");
            }
            else
            {   JOptionPane.showMessageDialog(null,"Please Check Again !! ");
            }
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
