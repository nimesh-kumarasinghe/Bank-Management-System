/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MTransaction;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class CTransaction {
    MTransaction transac=new MTransaction();

    public ResultSet getAccountDetails(String account_id)
    {   ResultSet rs;
        rs=transac.getAccountDetails(account_id);
        return rs;
    }

    public ResultSet depositMoney(String account_id,float deposit_amount)
    {   ResultSet rsAmount;
        rsAmount=transac.depositMoney(account_id,deposit_amount);
        return rsAmount;
    }

    public ResultSet withdrawMoney(String account_id,float withdraw_amount)
    {   ResultSet rsDAmount;
        rsDAmount=transac.withdrawMoney(account_id, withdraw_amount);
        return rsDAmount;
    }

    public void addInterest(String account_type,float interest)
    {   transac.addInterest(account_type, interest);
    }
}
