/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MDeleteUser;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CDeleteUser {
    public ResultSet getUserData(String user_type,String user_id)
    {   MDeleteUser user_details = new MDeleteUser();
        return user_details.getUserInfo(user_type, user_id);
    }
    public void deleteUser(String user_type,String user_id)
    {   MDeleteUser deleteuser = new MDeleteUser();
        deleteuser.deleteUser(user_type, user_id);
    }
}
