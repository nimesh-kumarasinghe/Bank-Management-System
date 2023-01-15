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
public class MDeleteAccount {
    DatabaseConnection mycon=new DatabaseConnection();

    public ResultSet getDetails(String account_id)
    {   ResultSet rs=null;
        try 
        {   Statement st=mycon.createDbConnection().createStatement();
            rs=st.executeQuery("select AccType,AccountBalance,CFullname,NIC from bankaccount,customer where AccountID='"+account_id+"' and bankaccount.CusID=customer.CustomerID");
        }
        catch(SQLException e)
        {   JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (Exception e)
        {   JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }

    public void deleteBankAccount(String account_no)
    {
        try
        {   Statement st1,st2;
            st1=mycon.createDbConnection().createStatement();
            int i=st1.executeUpdate("Delete from transactions where AccountNo='"+account_no+"'");
            st2=mycon.createDbConnection().createStatement();
            int c=st2.executeUpdate("Delete from bankaccount where AccountID='"+account_no+"'");
            if (c==0 && i==0)
            {   JOptionPane.showMessageDialog(null,"Account Deletion Faild");
            }
            else
            {   JOptionPane.showMessageDialog(null,"Account Closed Successfully!");
            }
        }
        catch(SQLException e)
        {   JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
