/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MViewCustomer;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CViewCustomer {
    MViewCustomer viewcus=new MViewCustomer();

    public ResultSet getDetails(String sql)
    {   ResultSet rs;
        rs=viewcus.getDetails(sql);
        return rs;
    }
}
