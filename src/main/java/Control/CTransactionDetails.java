/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MTransactionDetails;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CTransactionDetails {
    MTransactionDetails tdetails=new MTransactionDetails();

    public ResultSet getDetails(String sql)
    {   ResultSet rs;
        rs=tdetails.getDetails(sql);
        return rs;
    }
}
