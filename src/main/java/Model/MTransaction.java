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
public class MTransaction {
    DatabaseConnection mycon=new DatabaseConnection();
    String transaction_id;

    public ResultSet getAccountDetails(String account_id)
    {   ResultSet rs=null;    
        try
        {
            Statement st=mycon.createDbConnection().createStatement();
            rs=st.executeQuery("Select AccountID,CusID,AccType,AccountBalance from BankAccount where AccountID='" + account_id + "'");  
        }
        catch(SQLException e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rs;
    }   
    public ResultSet depositMoney(String account_id,float deposit_amount)
    {   ResultSet rsAmount=null;
        try
        {   Statement st1,st2,st3;

            //Insert to Bank Account
            st1=mycon.createDbConnection().createStatement();
            int c=st1.executeUpdate("update BankAccount set AccountBalance=AccountBalance+" + deposit_amount + " where AccountID='" + account_id + "'");
            //Insert to Transactions          
            st2=mycon.createDbConnection().createStatement();
            generateTransactionID(); 
            int i=st2.executeUpdate("Insert into Transactions(TransactionID,AccountNo,TransactionType,Amount,TransactionDateTime) values('"+transaction_id+"', '" + account_id + "', 'Deposit'," + deposit_amount + ", NOW())");
            if(c==1 && i==1)
            {   JOptionPane.showMessageDialog(null,"Deposit successful");
            }
            else
            {   JOptionPane.showMessageDialog(null,"Deposit Faild");
            }
            //Get Updated Account Balance
            st3=mycon.createDbConnection().createStatement(); 
            rsAmount=st3.executeQuery("select AccountBalance from BankAccount where AccountID='" + account_id + "'");
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rsAmount;
    }

    public ResultSet withdrawMoney(String account_id,float withdraw_amount)
    {   ResultSet rsDAmount=null;
        try
        {   Statement st1,st2,st3;
            //Insert Bank Account
            st1=mycon.createDbConnection().createStatement();
            int c=st1.executeUpdate("update BankAccount set AccountBalance=AccountBalance-" + withdraw_amount + " where AccountID='" + account_id + "'");
            //Insert to Transactions
            st2=mycon.createDbConnection().createStatement();
            generateTransactionID();
            int i=st2.executeUpdate("Insert into Transactions(TransactionID,AccountNo,TransactionType,Amount,TransactionDateTime) values('"+transaction_id+"', '" + account_id + "', 'Withdraw'," + withdraw_amount + ", NOW())");
            if(c==1 && i==1)
            {   JOptionPane.showMessageDialog(null,"Withdraw Successful");
            }
            else 
            {   JOptionPane.showMessageDialog(null,"Withdraw Faild");
            }
            //Get Updated Account Balance
            st3=mycon.createDbConnection().createStatement();
            rsDAmount=st3.executeQuery("select AccountBalance from BankAccount where AccountID='" + account_id + "'");
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rsDAmount;
    }
    
    public void addInterest(String account_type,float interest)
    {
        try 
        {   Statement st=mycon.createDbConnection().createStatement();
            int c=st.executeUpdate("Update bankaccount set AccountBalance=AccountBalance+(AccountBalance*" + interest + "), Intrest=Intrest+(AccountBalance*" + interest + ") where AccType='"+ account_type +"' ");
            if (c==0)
            {   JOptionPane.showMessageDialog(null, "Update Failed");
            }
            else if (c>0)
            {   JOptionPane.showMessageDialog(null, "Update Successful");
            }        
        }   
        catch (Exception e)
        {   JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void generateTransactionID()
    {   
        try 
        {
            Statement st=mycon.createDbConnection().createStatement();
            ResultSet rs=st.executeQuery("select MAX(TransactionID) from Transactions");
            rs.next();
            rs.getString("MAX(TransactionID)");
            if(rs.getString("MAX(TransactionID)")==null)
            {
                transaction_id="T0000000000000000001";
            }
            else
            {
                Long id=Long.parseLong(rs.getString("MAX(TransactionID)").substring(2,rs.getString("MAX(TransactionID)").length()));
                id++;
                transaction_id=("T0"+ String.format("%018d", id));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
