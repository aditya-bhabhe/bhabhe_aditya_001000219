/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author adity
 */
public class RestaurantInformation extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantInformation
     */
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private JPanel userContainer;
    public RestaurantInformation(JPanel userContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.userContainer = userContainer;
        displayFields();
        txtCustomerName.setEnabled(false);
       txtCustomerPassword.setEnabled(false);
       txtCustomerUserName.setEnabled(false);
    }
    
    public void displayFields(){
        for(Restaurant restaurant: ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restaurant.getRestaurantUserName().equals(userAccount.getUsername())){
                txtCustomer.setText(restaurant.getRestaurantUserName());
                txtCustomerName.setText(restaurant.getRestaurantName());
                txtCustomerPassword.setText(restaurant.getRestaurantAddress());
                txtCustomerUserName.setText(restaurant.getRestaurantNumber());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCustomerName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerPassword = new javax.swing.JTextField();
        lblCustomerPassword = new javax.swing.JLabel();
        txtCustomerUserName = new javax.swing.JTextField();
        lblCustomerUserName = new javax.swing.JLabel();
        btnInfoUpdate = new javax.swing.JButton();
        btnInfoSave = new javax.swing.JButton();
        btnInfoBack = new javax.swing.JButton();
        lblCustomer = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();

        setBackground(new java.awt.Color(214, 208, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCustomerName.setText("Restaurant Name :");
        add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, 20));
        add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 260, 30));

        txtCustomerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerPasswordActionPerformed(evt);
            }
        });
        add(txtCustomerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 260, 30));

        lblCustomerPassword.setText("Address :");
        add(lblCustomerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 110, 20));

        txtCustomerUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerUserNameActionPerformed(evt);
            }
        });
        add(txtCustomerUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 260, 30));

        lblCustomerUserName.setText("Phone Number :");
        add(lblCustomerUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 20));

        btnInfoUpdate.setBackground(new java.awt.Color(214, 50, 48));
        btnInfoUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoUpdate.setText("Update");
        btnInfoUpdate.setBorder(null);
        btnInfoUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoUpdateActionPerformed(evt);
            }
        });
        add(btnInfoUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 120, 40));

        btnInfoSave.setBackground(new java.awt.Color(214, 50, 48));
        btnInfoSave.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoSave.setText("Save");
        btnInfoSave.setBorder(null);
        btnInfoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoSaveActionPerformed(evt);
            }
        });
        add(btnInfoSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 130, 40));

        btnInfoBack.setBackground(new java.awt.Color(214, 50, 48));
        btnInfoBack.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoBack.setText("Back");
        btnInfoBack.setBorder(null);
        btnInfoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoBackActionPerformed(evt);
            }
        });
        add(btnInfoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 120, 40));

        lblCustomer.setText("Restaurant User Name :");
        add(lblCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 20));

        txtCustomer.setEditable(false);
        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });
        add(txtCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerPasswordActionPerformed

    private void txtCustomerUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerUserNameActionPerformed

    private void btnInfoUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoUpdateActionPerformed
        // TODO add your handling code here:
       txtCustomerName.setEnabled(true);
       txtCustomerPassword.setEnabled(true);
       txtCustomerUserName.setEnabled(true);
       btnInfoUpdate.setEnabled(false);
    }//GEN-LAST:event_btnInfoUpdateActionPerformed

    private void btnInfoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoSaveActionPerformed
        // TODO add your handling code here:
        for(Restaurant restaurant: ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restaurant.getRestaurantUserName().equals(userAccount.getUsername())){
                ecosystem.getRestaurantDirectory().updateRestaurant(restaurant, txtCustomerName.getText(), txtCustomerUserName.getText(), txtCustomerPassword.getText());
            }
        }

        txtCustomerName.setEnabled(false);
       txtCustomerPassword.setEnabled(false);
       txtCustomerUserName.setEnabled(false);
       btnInfoUpdate.setEnabled(true);
    }//GEN-LAST:event_btnInfoSaveActionPerformed

    private void btnInfoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoBackActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);
        CardLayout card = (CardLayout) userContainer.getLayout();
        card.previous(userContainer);
    }//GEN-LAST:event_btnInfoBackActionPerformed

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfoBack;
    private javax.swing.JButton btnInfoSave;
    private javax.swing.JButton btnInfoUpdate;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerPassword;
    private javax.swing.JLabel lblCustomerUserName;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerPassword;
    private javax.swing.JTextField txtCustomerUserName;
    // End of variables declaration//GEN-END:variables
}
