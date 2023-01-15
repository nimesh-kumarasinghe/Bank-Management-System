/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MUpdateUser;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CUpdateUser {
    public void udateAdminData(String user_type,String userid,String fname,String ininame,String nic,String gender,String dob,String age, String address,String tpno,String email,String password)
    {   MUpdateUser mu = new MUpdateUser();
        mu.udateAdminData(user_type,userid,fname,ininame,nic,gender,dob,age,address,tpno,email,password);
    }
    public ResultSet getData(String usertype,String userid)
    { MUpdateUser x = new MUpdateUser();
      ResultSet rs;
      rs=x.getData(usertype,userid);
      return rs;
    }
}
