/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class ManageCustomer extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomer
     */
    
    private JPanel userContainer;
    private EcoSystem ecosystem;
    private UserAccount userAcc;
    public ManageCustomer(JPanel userContainer, EcoSystem ecosystem) {
        initComponents();
        this.setSize(1680, 1050);
        this.userContainer = userContainer;
        this.ecosystem = ecosystem;
        displayCustomerTable();
    }
    
    
    public void displayCustomerTable(){
        DefaultTableModel table = (DefaultTableModel) tblCustomer.getModel();
        table.setRowCount(0);
        for(UserAccount userAcc : ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(userAcc.getRole().getClass().getName() == "Business.Role.CustomerRole"){
                Object [] row = new Object[5];
                row[0] = userAcc.getName();
                row[1] = userAcc.getUsername();
                row[2] = userAcc.getPassword();
                row[3] = userAcc.getUserAddress();
                row[4] = userAcc.getUserPhone();
                table.addRow(row);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnCustomerSave = new javax.swing.JButton();
        btnCustomerUpdate = new javax.swing.JButton();
        btnCustomerDelete = new javax.swing.JButton();
        btnCustomerCreate = new javax.swing.JButton();
        btnCustomerBack = new javax.swing.JButton();
        txtCustomerAddress = new javax.swing.JTextField();
        lblCustomerPassword1 = new javax.swing.JLabel();
        txtCustomerPhone = new javax.swing.JTextField();
        lblCustomerPassword2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 208, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCustomerName.setText("Name :");
        add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 80, 20));
        add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 260, 30));

        txtCustomerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerPasswordActionPerformed(evt);
            }
        });
        add(txtCustomerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 260, 30));

        lblCustomerPassword.setText("User Password :");
        add(lblCustomerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 80, 20));

        txtCustomerUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerUserNameActionPerformed(evt);
            }
        });
        add(txtCustomerUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 260, 30));

        lblCustomerUserName.setText("User Name :");
        add(lblCustomerUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, 20));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Customer User Name", "Customer Password", "Customer Address", "Customer Phone"
            }
        ));
        jScrollPane2.setViewportView(tblCustomer);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 110));

        btnCustomerSave.setBackground(new java.awt.Color(214, 50, 48));
        btnCustomerSave.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomerSave.setText("Save");
        btnCustomerSave.setBorder(null);
        btnCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerSaveActionPerformed(evt);
            }
        });
        add(btnCustomerSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, 40));

        btnCustomerUpdate.setBackground(new java.awt.Color(214, 50, 48));
        btnCustomerUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomerUpdate.setText("Update");
        btnCustomerUpdate.setBorder(null);
        btnCustomerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerUpdateActionPerformed(evt);
            }
        });
        add(btnCustomerUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 120, 40));

        btnCustomerDelete.setBackground(new java.awt.Color(214, 50, 48));
        btnCustomerDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomerDelete.setText("Delete");
        btnCustomerDelete.setBorder(null);
        btnCustomerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerDeleteActionPerformed(evt);
            }
        });
        add(btnCustomerDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 120, 40));

        btnCustomerCreate.setBackground(new java.awt.Color(214, 50, 48));
        btnCustomerCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomerCreate.setText("Create");
        btnCustomerCreate.setBorder(null);
        btnCustomerCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerCreateActionPerformed(evt);
            }
        });
        add(btnCustomerCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 170, 30));

        btnCustomerBack.setBackground(new java.awt.Color(214, 50, 48));
        btnCustomerBack.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomerBack.setText("Back");
        btnCustomerBack.setBorder(null);
        btnCustomerBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerBackActionPerformed(evt);
            }
        });
        add(btnCustomerBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 120, 40));

        txtCustomerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerAddressActionPerformed(evt);
            }
        });
        add(txtCustomerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 260, 30));

        lblCustomerPassword1.setText("User Address :");
        add(lblCustomerPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, 20));

        txtCustomerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerPhoneActionPerformed(evt);
            }
        });
        add(txtCustomerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 260, 30));

        lblCustomerPassword2.setText("User Phone :");
        add(lblCustomerPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerPasswordActionPerformed

    private void txtCustomerUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerUserNameActionPerformed

    private void btnCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerSaveActionPerformed
        // TODO add your handling code here:
        if(txtCustomerName.getText().equals("") || txtCustomerUserName.getText().equals("") || txtCustomerPassword.getText().equals("") || txtCustomerAddress.getText().equals("") || txtCustomerPhone.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Enter All Fields");
       }else{
            ecosystem.getUserAccountDirectory().updateUserAccount(userAcc,txtCustomerName.getText(),txtCustomerUserName.getText(),txtCustomerPassword.getText(),txtCustomerAddress.getText(),txtCustomerPhone.getText());
        displayCustomerTable();
        txtCustomerName.setText("");
        txtCustomerUserName.setText("");
        txtCustomerPassword.setText("");
        txtCustomerAddress.setText("");
        txtCustomerPhone.setText("");
        }  
    }//GEN-LAST:event_btnCustomerSaveActionPerformed

    private void btnCustomerCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerCreateActionPerformed
        // TODO add your handling code here:
        if(txtCustomerName.getText().equals("") || txtCustomerUserName.getText().equals("") || txtCustomerPassword.getText().equals("") || txtCustomerAddress.getText().equals("") || txtCustomerPhone.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Enter All Fields");
       }else{
            if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtCustomerUserName.getText())){
            UserAccount userAcc = ecosystem.getUserAccountDirectory().createUserAccount(txtCustomerName.getText(),txtCustomerUserName.getText(),txtCustomerPassword.getText(),txtCustomerAddress.getText(),txtCustomerPhone.getText(),null ,new CustomerRole());
             Customer customer = ecosystem.getCustomerDirectory().createUserAccount(txtCustomerUserName.getText(),txtCustomerName.getText());
            displayCustomerTable();
        }
        } 
        
    }//GEN-LAST:event_btnCustomerCreateActionPerformed

    private void btnCustomerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerDeleteActionPerformed
        // TODO add your handling code here:
        int focusRow = tblCustomer.getSelectedRow();
        if(focusRow >= 0){
            int focusButton = JOptionPane.YES_NO_OPTION;
            int focusResult = JOptionPane.showConfirmDialog(null, "Confirm delete?","Warning",focusButton);
            if(focusResult == JOptionPane.YES_OPTION){
                String username= (String) tblCustomer.getValueAt(focusRow, 1);
                String pwd= (String) tblCustomer.getValueAt(focusRow, 2);
                UserAccount user=ecosystem.getUserAccountDirectory().authenticateUser(username, pwd);

               
                ecosystem.getUserAccountDirectory().deleteUserAccount(user);
                ecosystem.getCustomerDirectory().deleteCustomer(user.getUsername());
                displayCustomerTable();
            }else{
                JOptionPane.showMessageDialog(null, "Please select a customer to delete the customer account");
            }      
        }
    }//GEN-LAST:event_btnCustomerDeleteActionPerformed

    private void btnCustomerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerUpdateActionPerformed
        // TODO add your handling code here:
        int focusRow = tblCustomer.getSelectedRow();

        if(focusRow >= 0){
            String name = (String) tblCustomer.getValueAt(focusRow, 0);
            String username= (String) tblCustomer.getValueAt(focusRow, 1);
            String password= (String) tblCustomer.getValueAt(focusRow, 2);
            String address = (String) tblCustomer.getValueAt(focusRow,3);
            String phone = (String) tblCustomer.getValueAt(focusRow,4);
            userAcc = ecosystem.getUserAccountDirectory().authenticateUser(username, password);

            txtCustomerName.setText(name+"");
            txtCustomerUserName.setText(username+"");
            txtCustomerPassword.setText(password+"");
            txtCustomerAddress.setText(address+"");
            txtCustomerPhone.setText(phone+"");
            
            JOptionPane.showMessageDialog(null,"Please press save button to save the customer profile after updating the text field");
            

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a customer to update a profile");
        }
    }//GEN-LAST:event_btnCustomerUpdateActionPerformed

    private void btnCustomerBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerBackActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);
        CardLayout card = (CardLayout) userContainer.getLayout();
        card.previous(userContainer);
    }//GEN-LAST:event_btnCustomerBackActionPerformed

    private void txtCustomerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerAddressActionPerformed

    private void txtCustomerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerPhoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerBack;
    private javax.swing.JButton btnCustomerCreate;
    private javax.swing.JButton btnCustomerDelete;
    private javax.swing.JButton btnCustomerSave;
    private javax.swing.JButton btnCustomerUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerPassword;
    private javax.swing.JLabel lblCustomerPassword1;
    private javax.swing.JLabel lblCustomerPassword2;
    private javax.swing.JLabel lblCustomerUserName;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerPassword;
    private javax.swing.JTextField txtCustomerPhone;
    private javax.swing.JTextField txtCustomerUserName;
    // End of variables declaration//GEN-END:variables
    

}
