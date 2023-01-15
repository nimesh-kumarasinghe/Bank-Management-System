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
public class MAddCustomer {
          public void saveMemberData(String customer_id,String customer_fullname,String customer_ininame, String customer_dob, int customer_age,String customer_gender,String customer_nic,String customer_address, int customer_tp,String customer_email,String account_id,String account_type, String first_deposit)
       {


       try
        {
        DatabaseConnection mycon=new DatabaseConnection();
        Statement st= mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("insert into customer values('"+customer_id+"','"+customer_fullname+"','"+customer_ininame+"','"+customer_nic+"','"+customer_gender+"','"+customer_dob+"','"+customer_age+"','"+customer_address+"','"+customer_tp+"','"+customer_email+"')");
        int count2=st.executeUpdate("insert into bankaccount values('"+account_id+"','"+account_type+"','"+first_deposit+"','"+0+"','"+customer_id+"')");
        if(count>0&&count2>0)
        {
            JOptionPane.showMessageDialog(null,"Customer Saved Successfull");
        }
        else
        {   
           JOptionPane.showMessageDialog(null,"Please Check Again !! ");
        }
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
       }
  
    public String getNextUserID()
    {   ResultSet rs = null;
        String column_name="CustomerID";
        try
        {   DatabaseConnection con = new DatabaseConnection();
            Statement st=con.createDbConnection().createStatement();
            rs = st.executeQuery("select MAX("+column_name+") from customer");
            rs.next();
            rs.getString("MAX("+column_name+")");
            if(rs.getString("MAX("+column_name+")") == null)
            {   return "C001";
            }
            else
            {   Long id = Long.parseLong(rs.getString("MAX("+column_name+")").substring(1,rs.getString("MAX("+column_name+")").length()));
                id++;
                return "C" + String.format("%03d", id);
            }
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return null;
    }
}
