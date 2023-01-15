/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MAddUser;

/**
 *
 * @author DELL
 */
public class CAddUser {
    public void saveUserData(String user_type,String user_id,String full_name,String name_with_i,String dob,String age,String nic,String gender,String address,String tp_number,String email,String password)
    {   MAddUser user = new MAddUser();
        user.saveUserData(user_type,user_id,full_name,name_with_i,dob,age,nic,gender,address,tp_number,email,password);
    }
    public String getNextUserId(String user_type)
    {   MAddUser next_user = new MAddUser();
        String x = next_user.getNextUserID(user_type);
        return x;
    }
}
