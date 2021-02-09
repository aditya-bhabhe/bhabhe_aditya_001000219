/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Demographic;

/**
 *
 * @author adity
 */
public class CreateDemographic extends javax.swing.JPanel {

    /**
     * Creates new form createDemographic
     */
    Demographic demographic;
    public CreateDemographic(Demographic demographic) {
        initComponents();
        this.demographic = demographic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSaveChecking = new javax.swing.JButton();
        lblDemographicInfo = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        btnSaveDemographic = new javax.swing.JButton();
        txtSocialNumber = new javax.swing.JTextField();
        lblSocialNumber = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        btnSaveChecking.setText("Save");

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDemographicInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDemographicInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDemographicInfo.setText("Demographic Information");
        add(lblDemographicInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 27));

        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name:");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 128, 22));

        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name:");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 128, 22));

        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 128, 22));

        lblBirthDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBirthDate.setText("Date of Birth:");
        add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, 128, 22));

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, 128, 22));

        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHeight.setText("Height:");
        add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 128, 22));

        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWeight.setText("Weight:");
        add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, 128, 22));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 71, 158, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 99, 158, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 127, 158, -1));
        add(txtBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 155, 158, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 183, 158, -1));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 211, 158, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 239, 158, -1));

        btnSaveDemographic.setText("Save");
        btnSaveDemographic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDemographicActionPerformed(evt);
            }
        });
        add(btnSaveDemographic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));
        add(txtSocialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 267, 158, -1));

        lblSocialNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSocialNumber.setText("Social Security Number:");
        add(lblSocialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, 128, 22));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDemographicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDemographicActionPerformed
        // TODO add your handling code here:
        demographic.setFirstName(txtFirstName.getText());
        demographic.setLastName(txtLastName.getText());
        demographic.setPhoneNumber(txtPhoneNumber.getText());
        demographic.setBirthDate(txtBirthDate.getText());
        demographic.setAge(txtAge.getText());
        demographic.setHeight(txtHeight.getText());
        demographic.setWeight(txtWeight.getText());
        demographic.setSocialNumber(txtSocialNumber.getText());
        
        JOptionPane.showMessageDialog(this, "Demographic Information Saved");
    }//GEN-LAST:event_btnSaveDemographicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChecking;
    private javax.swing.JButton btnSaveDemographic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblDemographicInfo;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSocialNumber;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSocialNumber;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
