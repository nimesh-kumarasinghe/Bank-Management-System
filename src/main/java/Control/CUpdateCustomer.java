/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MUpdateCustomer;
import View.VUpdateCustomer;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CUpdateCustomer {
    public void updateCusData(String id,String fname,String ininame,String nic,String gender,String dob,String age, String address,String tpno,String email)
    {   MUpdateCustomer up = new MUpdateCustomer();
up.updateCusData(id,fname,ininame,nic,gender,dob,age,address,tpno,email);
        //up.updateCusData(id,fname,ininame,nic,gender,dob,age,address,tpno,email);
    }
    public ResultSet getDetails(String nic)
    { MUpdateCustomer v = new MUpdateCustomer();
      ResultSet rs;
        rs=v.getDetails(nic);

      return rs;
    }
}
