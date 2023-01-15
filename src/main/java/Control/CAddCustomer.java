/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MAddCustomer;

/**
 *
 * @author DELL
 */
public class CAddCustomer {
    public void saveMemberData (String customer_id,String customer_fullname,String customer_ininame,String customer_dob,int customer_age,String customer_gender,String customer_nic,String customer_address,int customer_tp,String customer_email,String account_id, String account_type,String first_deposit)
    {
      MAddCustomer mm=new MAddCustomer();
      mm.saveMemberData(customer_id,customer_fullname,customer_ininame, customer_dob,customer_age,customer_gender,customer_nic, customer_address,customer_tp,customer_email, account_id,account_type, first_deposit);
    } 

    public String getNextUserId()
    {   MAddCustomer next_user = new MAddCustomer();
        String x = next_user.getNextUserID();
        return x;
    }
}
