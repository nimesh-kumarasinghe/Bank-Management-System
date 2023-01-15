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
public class MViewCustomer {
    DatabaseConnection mycon=new DatabaseConnection();
    
    public ResultSet getDetails(String sql)
    {   ResultSet rs=null;
        try 
        {
            Statement st=mycon.createDbConnection().createStatement();
            rs=st.executeQuery(sql);
        }
        catch(SQLException e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch (Exception e)
        {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rs;
    } 
}
