/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MAdminStaffDetails;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CAdminStaffDetails {
    MAdminStaffDetails ASdetails=new MAdminStaffDetails();

    public ResultSet getDetails(String sql)
    {       ResultSet rs;
            rs=ASdetails.getDetails(sql);
            return rs;
    }
}
