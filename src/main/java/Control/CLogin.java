/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MLogin;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CLogin {
    public ResultSet getData(String usertype,String userid,String password)
    {   MLogin x = new MLogin();
        ResultSet rs;
        rs=x.getData(usertype,userid,password);
      return rs;
    }
}
