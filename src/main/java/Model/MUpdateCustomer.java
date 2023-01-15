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
public class MUpdateCustomer {
    public void updateCusData(String id,String fname,String ininame,String nic,String gender,String dob,String age, String address,String tpno,String email)
    {   String query="";

            query="update customer set CFullname='"+fname+"',CInitialtName='"+ininame+"',NIC='"+nic+"',Gender='"+gender+"',DOB='"+dob+"',Age="+age+",CustomerAddress='"+address+"',TpNo="+tpno+",Email='"+email+"' where CustomerID='"+id+"'";

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


public ResultSet getDetails(String nic)
        {
            String query="select * from customer where NIC='"+nic+"'";

            ResultSet rs=null;
            try
            {
            DatabaseConnection mycon = new DatabaseConnection();
            Statement st=mycon.createDbConnection().createStatement();
            rs=st.executeQuery(query);
            if(rs.next() == false)
            {   JOptionPane.showMessageDialog(null,"Invalid User","Error",0);
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
}
