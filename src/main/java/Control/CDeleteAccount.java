/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MDeleteAccount;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CDeleteAccount {
    MDeleteAccount mdelete=new MDeleteAccount();

    public ResultSet getDetails(String account_id)
    {   ResultSet rs;
        rs=mdelete.getDetails(account_id);
        return rs;
    }

    public void deleteBankAccount(String account_no)
    {
        mdelete.deleteBankAccount(account_no);
    }
}
