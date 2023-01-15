/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.VAdminDashboard;
import View.VLogin;
import View.VStaffDashboard;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MLogin {
    public ResultSet getData(String usertype,String userid,String password)
        {
                    String query="";
  
                    if(usertype=="admin")
                    {
                        query="select * from admin where AdminId='"+userid+"' and AdminPassword='"+password+"'";

                    }
                    else if(usertype=="staff")
                    {
                        query="select * from staff where StaffID='"+userid+"' and StaffPassword='"+password+"'";
                    }
            ResultSet rs=null;
            try
            {
            DatabaseConnection mycon = new DatabaseConnection();
            Statement st=mycon.createDbConnection().createStatement();
            rs=st.executeQuery(query);
            if(rs.next() == false)
            {   JOptionPane.showMessageDialog(null,"Invalid UserID");
            }
            else
            {   if(usertype=="admin")
                {
                    rs=st.executeQuery(query);
                    saveLoginInfo(userid);
                    VLogin lo =new VLogin();
                    lo.dispose();
                    VAdminDashboard vx = new VAdminDashboard();
                    vx.show();
                    
                }
                else if (usertype=="staff")
                {                  
                    rs=st.executeQuery(query);
                    saveLoginInfo(userid);
                    VStaffDashboard vx = new VStaffDashboard();
                    vx.show();
                    VLogin lo =new VLogin();
                    lo.dispose();
                }

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
            public void saveLoginInfo(String userid)
            {   
                char[] ch = new char[userid.length()];
                for (int i = 0; i < userid.length(); i++) {
                    ch[i] = userid.charAt(i);
                }
                try{
                    FileWriter ft = new FileWriter("UserDetails.txt");
                    ft.write(ch);
                    ft.close();
                }
                catch(FileNotFoundException ex)
                {    JOptionPane.showMessageDialog(null,ex.getMessage());   
                }
                catch(IOException ex)
                {    JOptionPane.showMessageDialog(null,ex.getMessage());   
                }
            }
}
