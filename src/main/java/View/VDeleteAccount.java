/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.CDeleteAccount;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VDeleteAccount extends javax.swing.JFrame {

    /**
     * Creates new form VDeleteAccount
     */
    public VDeleteAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_accountType = new javax.swing.JTextField();
        txt_balance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_closeAccount = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        txt_accountNo = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        lbl_back2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Close Bank Account");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("CLOSE BANK ACCOUNT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Account Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        txt_accountType.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_accountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 190, -1));

        txt_balance.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Account Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Balance");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        btn_closeAccount.setBackground(new java.awt.Color(204, 0, 0));
        btn_closeAccount.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_closeAccount.setForeground(new java.awt.Color(255, 255, 255));
        btn_closeAccount.setText("Close Account");
        btn_closeAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btn_closeAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 146, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        txt_name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 230, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("NIC");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        txt_nic.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 230, -1));

        txt_accountNo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_accountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 330, -1));

        btn_search.setBackground(new java.awt.Color(153, 153, 153));
        btn_search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 150, -1));

        lbl_back2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_back2.setText("<< Back");
        lbl_back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeAccountActionPerformed
        // TODO add your handling code here:
        float account_balance=Float.parseFloat(txt_balance.getText());
        if(account_balance>0)
        {   JOptionPane.showMessageDialog(null,"Please Withdraw Money before closing the Account");
        }
        else
        {
            CDeleteAccount cdelete=new CDeleteAccount();
            cdelete.deleteBankAccount(txt_accountNo.getText());
            txt_accountNo.setText("");
            txt_accountType.setText("");
            txt_balance.setText("");
            txt_name.setText("");
            txt_nic.setText("");
        }
    }//GEN-LAST:event_btn_closeAccountActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        if(txt_accountNo == null || txt_accountNo.getText().trim().isEmpty())
        {   JOptionPane.showMessageDialog(null,"Enter Account Number","Error",0);
        }
        else
        {
            try
            {   String account_id=txt_accountNo.getText();
                ResultSet rs;
                CDeleteAccount cdelete=new CDeleteAccount();
                rs=cdelete.getDetails(account_id);
                if(rs.next())
                {
                    String type=rs.getString("AccType");
                    txt_accountType.setText(type);
                    float balance=rs.getFloat("AccountBalance");
                    txt_balance.setText(String.valueOf(balance));
                    String name=rs.getString("CFullname");
                    txt_name.setText(name);
                    String nic=rs.getString("NIC");
                    txt_nic.setText(nic);
                }
            }
            catch(SQLException e)
            {   JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch(Exception e)
            {   JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void lbl_back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back2MouseClicked
        try{
            int result;
            FileReader reader1 = new FileReader("UserDetails.txt");
            while ((result=reader1.read())!=-1)
            {   String id;
                id=String.valueOf(result);
                char code=id.charAt(0);
                if(code=='6')
                {   
                    VAdminDashboard adash = new VAdminDashboard();
                    adash.show();
                    this.dispose();

                }
                else
                {
                    VStaffDashboard adash = new VStaffDashboard();
                    adash.show();
                    this.dispose();
                }
                break;
            }
        }

        catch(FileNotFoundException e)
        {	JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(IOException e)
        {	JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_lbl_back2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VDeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDeleteAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_closeAccount;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_back2;
    private javax.swing.JTextField txt_accountNo;
    private javax.swing.JTextField txt_accountType;
    private javax.swing.JTextField txt_balance;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nic;
    // End of variables declaration//GEN-END:variables
}