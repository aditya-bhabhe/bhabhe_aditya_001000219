/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.ImageIcon;
import model.Address;
import model.Checking;
import model.Demographic;
import model.DriverLic;
import model.Medical;
import model.Saving;

/**
 *
 * @author adity
 */
public class ViewReport extends javax.swing.JPanel {

    /**
     * Creates new form ViewRecord
     */
    Demographic demographic;
    Address address;
    Saving saving;
    Checking checking;
    Medical medical;
    DriverLic driverLic;
    public ViewReport(Demographic demographic, Address address, Medical medical, DriverLic driverLic, Checking checking, Saving saving) {
        initComponents();
        this.demographic = demographic;
        this.address = address;
        this.saving = saving;
        this.checking = checking;
        this.medical = medical;
        this.driverLic = driverLic;
        displayRecord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReportAddress = new javax.swing.JLabel();
        lblReportAge = new javax.swing.JLabel();
        lblReportHeight = new javax.swing.JLabel();
        lblReportWeight = new javax.swing.JLabel();
        txtReportAge = new javax.swing.JTextField();
        txtReportHeight = new javax.swing.JTextField();
        lblReportSsn = new javax.swing.JLabel();
        txtReportWeight = new javax.swing.JTextField();
        txtReportSsn = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblReportPhone = new javax.swing.JLabel();
        lblReportFirst = new javax.swing.JLabel();
        txtReportPhone = new javax.swing.JTextField();
        txtReportLast = new javax.swing.JTextField();
        txtReportFirst = new javax.swing.JTextField();
        txtReportBirthDate = new javax.swing.JTextField();
        lblReportBirthDate = new javax.swing.JLabel();
        lblReportLast = new javax.swing.JLabel();
        lblReportDemo40 = new javax.swing.JLabel();
        lblReportStreet = new javax.swing.JLabel();
        txtReportStreet = new javax.swing.JTextField();
        lblReportCity = new javax.swing.JLabel();
        txtReportCity = new javax.swing.JTextField();
        lblReportState = new javax.swing.JLabel();
        txtReportState = new javax.swing.JTextField();
        lblReportZip = new javax.swing.JLabel();
        txtReportZip = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblReportSavingAccountType = new javax.swing.JLabel();
        txtReportSavingAccountType = new javax.swing.JTextField();
        lblReportSavingAccountNumber = new javax.swing.JLabel();
        lblReportSavingBankName = new javax.swing.JLabel();
        txtReportSavingAccountNumber = new javax.swing.JTextField();
        txtReportSavingRoutingNumber = new javax.swing.JTextField();
        txtReportSavingBankName = new javax.swing.JTextField();
        txtReportSavingAccountBalance = new javax.swing.JTextField();
        lblReportSavingAccountBalance = new javax.swing.JLabel();
        lblReportSavingRoutingNumber = new javax.swing.JLabel();
        lblReportSaving = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblReportCheckingAccountType = new javax.swing.JLabel();
        txtReportCheckingAccountType = new javax.swing.JTextField();
        lblReportCheckingBankName = new javax.swing.JLabel();
        lblReportChecking = new javax.swing.JLabel();
        lblReportCheckingAccountNumber = new javax.swing.JLabel();
        txtReportCheckingAccountNumber = new javax.swing.JTextField();
        txtReportCheckingRoutingNumber = new javax.swing.JTextField();
        txtReportCheckingBankName = new javax.swing.JTextField();
        txtReportCheckingAccountBalance = new javax.swing.JTextField();
        lblReportCheckingAccountBalance = new javax.swing.JLabel();
        lblReportCheckingRoutingNumber = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblReportLicenseNumber = new javax.swing.JLabel();
        lblReportDriverLic = new javax.swing.JLabel();
        lblReportExpirationDate = new javax.swing.JLabel();
        txtReportExpirationDate = new javax.swing.JTextField();
        txtReportIssueDate = new javax.swing.JTextField();
        txtReportLicenseNumber = new javax.swing.JTextField();
        txtReportBloodType = new javax.swing.JTextField();
        lblReportBloodType = new javax.swing.JLabel();
        lblReportIssueDate = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblReportAllergy2 = new javax.swing.JLabel();
        lblReportMedicalNumber = new javax.swing.JLabel();
        txtReportAllergy2 = new javax.swing.JTextField();
        txtReportAllergy1 = new javax.swing.JTextField();
        txtReportMedicalNumber = new javax.swing.JTextField();
        txtReportAllergy3 = new javax.swing.JTextField();
        lblAllergy3 = new javax.swing.JLabel();
        lblReportAllergy1 = new javax.swing.JLabel();
        lblReportDemo47 = new javax.swing.JLabel();
        lblReportDriverPic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReportAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReportAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportAddress.setText("Address Information");
        add(lblReportAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 203, 22));

        lblReportAge.setText("Age:");
        add(lblReportAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 101, -1));

        lblReportHeight.setText("Height:");
        add(lblReportHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 101, -1));

        lblReportWeight.setText("Weight:");
        add(lblReportWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 101, -1));

        txtReportAge.setEditable(false);
        txtReportAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportAgeActionPerformed(evt);
            }
        });
        add(txtReportAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 153, -1));

        txtReportHeight.setEditable(false);
        txtReportHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportHeightActionPerformed(evt);
            }
        });
        add(txtReportHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 153, -1));

        lblReportSsn.setText("SSN:");
        add(lblReportSsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        txtReportWeight.setEditable(false);
        txtReportWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportWeightActionPerformed(evt);
            }
        });
        add(txtReportWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 153, -1));

        txtReportSsn.setEditable(false);
        txtReportSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportSsnActionPerformed(evt);
            }
        });
        add(txtReportSsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 153, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 680, 690, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 690, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Report");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 390, 30));

        lblReportPhone.setText("Phone Number:");
        add(lblReportPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 101, -1));

        lblReportFirst.setText("First Name:");
        add(lblReportFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 101, -1));

        txtReportPhone.setEditable(false);
        txtReportPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportPhoneActionPerformed(evt);
            }
        });
        add(txtReportPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 153, -1));

        txtReportLast.setEditable(false);
        txtReportLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportLastActionPerformed(evt);
            }
        });
        add(txtReportLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 153, -1));

        txtReportFirst.setEditable(false);
        txtReportFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportFirstActionPerformed(evt);
            }
        });
        add(txtReportFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 153, -1));

        txtReportBirthDate.setEditable(false);
        txtReportBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportBirthDateActionPerformed(evt);
            }
        });
        add(txtReportBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 153, -1));

        lblReportBirthDate.setText("Date of Birth:");
        add(lblReportBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 101, -1));

        lblReportLast.setText("Last Name:");
        add(lblReportLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 101, -1));

        lblReportDemo40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReportDemo40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportDemo40.setText("Demographic Information");
        add(lblReportDemo40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 203, 22));

        lblReportStreet.setText("Street:");
        add(lblReportStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 101, 20));

        txtReportStreet.setEditable(false);
        txtReportStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportStreetActionPerformed(evt);
            }
        });
        add(txtReportStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 153, -1));

        lblReportCity.setText("City:");
        add(lblReportCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 101, 20));

        txtReportCity.setEditable(false);
        txtReportCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportCityActionPerformed(evt);
            }
        });
        add(txtReportCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 153, -1));

        lblReportState.setText("State:");
        add(lblReportState, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 101, 20));

        txtReportState.setEditable(false);
        txtReportState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportStateActionPerformed(evt);
            }
        });
        add(txtReportState, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 153, -1));

        lblReportZip.setText("Zip Code:");
        add(lblReportZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 101, 20));

        txtReportZip.setEditable(false);
        txtReportZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportZipActionPerformed(evt);
            }
        });
        add(txtReportZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 153, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 700, 10));

        lblReportSavingAccountType.setText("Account Type:");
        add(lblReportSavingAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 101, -1));

        txtReportSavingAccountType.setEditable(false);
        txtReportSavingAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportSavingAccountTypeActionPerformed(evt);
            }
        });
        add(txtReportSavingAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 153, -1));

        lblReportSavingAccountNumber.setText("Account Number:");
        add(lblReportSavingAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 101, -1));

        lblReportSavingBankName.setText("Bank Name:");
        add(lblReportSavingBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 101, -1));

        txtReportSavingAccountNumber.setEditable(false);
        txtReportSavingAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportSavingAccountNumberActionPerformed(evt);
            }
        });
        add(txtReportSavingAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 153, -1));

        txtReportSavingRoutingNumber.setEditable(false);
        txtReportSavingRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportSavingRoutingNumberActionPerformed(evt);
            }
        });
        add(txtReportSavingRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 153, -1));

        txtReportSavingBankName.setEditable(false);
        txtReportSavingBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportSavingBankNameActionPerformed(evt);
            }
        });
        add(txtReportSavingBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 153, -1));

        txtReportSavingAccountBalance.setEditable(false);
        txtReportSavingAccountBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportSavingAccountBalanceActionPerformed(evt);
            }
        });
        add(txtReportSavingAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 153, -1));

        lblReportSavingAccountBalance.setText("Account Balance:");
        add(lblReportSavingAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 101, -1));

        lblReportSavingRoutingNumber.setText("Routing Number:");
        add(lblReportSavingRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 101, -1));

        lblReportSaving.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReportSaving.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportSaving.setText("Saving Account Information");
        add(lblReportSaving, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 203, 22));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 690, 10));

        lblReportCheckingAccountType.setText("Account Type:");
        add(lblReportCheckingAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 101, -1));

        txtReportCheckingAccountType.setEditable(false);
        txtReportCheckingAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportCheckingAccountTypeActionPerformed(evt);
            }
        });
        add(txtReportCheckingAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 153, -1));

        lblReportCheckingBankName.setText("Bank Name:");
        add(lblReportCheckingBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 101, -1));

        lblReportChecking.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReportChecking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportChecking.setText("Checking Account Information");
        add(lblReportChecking, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 203, 22));

        lblReportCheckingAccountNumber.setText("Account Number:");
        add(lblReportCheckingAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 101, -1));

        txtReportCheckingAccountNumber.setEditable(false);
        txtReportCheckingAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportCheckingAccountNumberActionPerformed(evt);
            }
        });
        add(txtReportCheckingAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 153, -1));

        txtReportCheckingRoutingNumber.setEditable(false);
        txtReportCheckingRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportCheckingRoutingNumberActionPerformed(evt);
            }
        });
        add(txtReportCheckingRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 153, -1));

        txtReportCheckingBankName.setEditable(false);
        txtReportCheckingBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportCheckingBankNameActionPerformed(evt);
            }
        });
        add(txtReportCheckingBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 153, -1));

        txtReportCheckingAccountBalance.setEditable(false);
        txtReportCheckingAccountBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportCheckingAccountBalanceActionPerformed(evt);
            }
        });
        add(txtReportCheckingAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 153, -1));

        lblReportCheckingAccountBalance.setText("Account Balance:");
        add(lblReportCheckingAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 101, -1));

        lblReportCheckingRoutingNumber.setText("Routing Number:");
        add(lblReportCheckingRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 101, -1));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 410, 700, 10));

        lblReportLicenseNumber.setText("License Number:");
        add(lblReportLicenseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 101, -1));

        lblReportDriverLic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReportDriverLic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportDriverLic.setText("Driver's License Information");
        add(lblReportDriverLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 203, 22));

        lblReportExpirationDate.setText("Date of Expiration:");
        add(lblReportExpirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 101, -1));

        txtReportExpirationDate.setEditable(false);
        txtReportExpirationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportExpirationDateActionPerformed(evt);
            }
        });
        add(txtReportExpirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 153, -1));

        txtReportIssueDate.setEditable(false);
        txtReportIssueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportIssueDateActionPerformed(evt);
            }
        });
        add(txtReportIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 153, -1));

        txtReportLicenseNumber.setEditable(false);
        txtReportLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportLicenseNumberActionPerformed(evt);
            }
        });
        add(txtReportLicenseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 153, -1));

        txtReportBloodType.setEditable(false);
        txtReportBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportBloodTypeActionPerformed(evt);
            }
        });
        add(txtReportBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 153, -1));

        lblReportBloodType.setText("Blood Type:");
        add(lblReportBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 101, -1));

        lblReportIssueDate.setText("Date of Issue:");
        add(lblReportIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 101, -1));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 530, 690, 10));

        lblReportAllergy2.setText("Allergy 2:");
        add(lblReportAllergy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 101, -1));

        lblReportMedicalNumber.setText("Record Number:");
        add(lblReportMedicalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, 101, -1));

        txtReportAllergy2.setEditable(false);
        txtReportAllergy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportAllergy2ActionPerformed(evt);
            }
        });
        add(txtReportAllergy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 740, 153, -1));

        txtReportAllergy1.setEditable(false);
        txtReportAllergy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportAllergy1ActionPerformed(evt);
            }
        });
        add(txtReportAllergy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, 153, -1));

        txtReportMedicalNumber.setEditable(false);
        txtReportMedicalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportMedicalNumberActionPerformed(evt);
            }
        });
        add(txtReportMedicalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 153, -1));

        txtReportAllergy3.setEditable(false);
        txtReportAllergy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportAllergy3ActionPerformed(evt);
            }
        });
        add(txtReportAllergy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 740, 153, -1));

        lblAllergy3.setText("Allergy 3:");
        add(lblAllergy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 101, -1));

        lblReportAllergy1.setText("Allergy 1:");
        add(lblReportAllergy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, 101, -1));

        lblReportDemo47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReportDemo47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportDemo47.setText("Medical Record Information");
        add(lblReportDemo47, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, 203, 22));

        lblReportDriverPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportDriverPic.setText("Image");
        lblReportDriverPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblReportDriverPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 150, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void txtReportAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportAgeActionPerformed

    private void txtReportHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportHeightActionPerformed

    private void txtReportWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportWeightActionPerformed

    private void txtReportSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportSsnActionPerformed

    private void txtReportPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportPhoneActionPerformed

    private void txtReportBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportBirthDateActionPerformed

    private void txtReportFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportFirstActionPerformed

    private void txtReportLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportLastActionPerformed

    private void txtReportStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportStreetActionPerformed

    private void txtReportCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportCityActionPerformed

    private void txtReportStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportStateActionPerformed

    private void txtReportZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportZipActionPerformed

    private void txtReportSavingAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportSavingAccountTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportSavingAccountTypeActionPerformed

    private void txtReportSavingAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportSavingAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportSavingAccountNumberActionPerformed

    private void txtReportSavingRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportSavingRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportSavingRoutingNumberActionPerformed

    private void txtReportSavingBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportSavingBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportSavingBankNameActionPerformed

    private void txtReportSavingAccountBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportSavingAccountBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportSavingAccountBalanceActionPerformed

    private void txtReportCheckingAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportCheckingAccountTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportCheckingAccountTypeActionPerformed

    private void txtReportCheckingAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportCheckingAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportCheckingAccountNumberActionPerformed

    private void txtReportCheckingRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportCheckingRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportCheckingRoutingNumberActionPerformed

    private void txtReportCheckingBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportCheckingBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportCheckingBankNameActionPerformed

    private void txtReportCheckingAccountBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportCheckingAccountBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportCheckingAccountBalanceActionPerformed

    private void txtReportExpirationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportExpirationDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportExpirationDateActionPerformed

    private void txtReportIssueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportIssueDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportIssueDateActionPerformed

    private void txtReportLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportLicenseNumberActionPerformed

    private void txtReportBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportBloodTypeActionPerformed

    private void txtReportAllergy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportAllergy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportAllergy2ActionPerformed

    private void txtReportAllergy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportAllergy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportAllergy1ActionPerformed

    private void txtReportMedicalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportMedicalNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportMedicalNumberActionPerformed

    private void txtReportAllergy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportAllergy3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportAllergy3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAllergy3;
    private javax.swing.JLabel lblReportAddress;
    private javax.swing.JLabel lblReportAge;
    private javax.swing.JLabel lblReportAllergy1;
    private javax.swing.JLabel lblReportAllergy2;
    private javax.swing.JLabel lblReportBirthDate;
    private javax.swing.JLabel lblReportBloodType;
    private javax.swing.JLabel lblReportChecking;
    private javax.swing.JLabel lblReportCheckingAccountBalance;
    private javax.swing.JLabel lblReportCheckingAccountNumber;
    private javax.swing.JLabel lblReportCheckingAccountType;
    private javax.swing.JLabel lblReportCheckingBankName;
    private javax.swing.JLabel lblReportCheckingRoutingNumber;
    private javax.swing.JLabel lblReportCity;
    private javax.swing.JLabel lblReportDemo40;
    private javax.swing.JLabel lblReportDemo47;
    private javax.swing.JLabel lblReportDriverLic;
    private javax.swing.JLabel lblReportDriverPic;
    private javax.swing.JLabel lblReportExpirationDate;
    private javax.swing.JLabel lblReportFirst;
    private javax.swing.JLabel lblReportHeight;
    private javax.swing.JLabel lblReportIssueDate;
    private javax.swing.JLabel lblReportLast;
    private javax.swing.JLabel lblReportLicenseNumber;
    private javax.swing.JLabel lblReportMedicalNumber;
    private javax.swing.JLabel lblReportPhone;
    private javax.swing.JLabel lblReportSaving;
    private javax.swing.JLabel lblReportSavingAccountBalance;
    private javax.swing.JLabel lblReportSavingAccountNumber;
    private javax.swing.JLabel lblReportSavingAccountType;
    private javax.swing.JLabel lblReportSavingBankName;
    private javax.swing.JLabel lblReportSavingRoutingNumber;
    private javax.swing.JLabel lblReportSsn;
    private javax.swing.JLabel lblReportState;
    private javax.swing.JLabel lblReportStreet;
    private javax.swing.JLabel lblReportWeight;
    private javax.swing.JLabel lblReportZip;
    private javax.swing.JTextField txtReportAge;
    private javax.swing.JTextField txtReportAllergy1;
    private javax.swing.JTextField txtReportAllergy2;
    private javax.swing.JTextField txtReportAllergy3;
    private javax.swing.JTextField txtReportBirthDate;
    private javax.swing.JTextField txtReportBloodType;
    private javax.swing.JTextField txtReportCheckingAccountBalance;
    private javax.swing.JTextField txtReportCheckingAccountNumber;
    private javax.swing.JTextField txtReportCheckingAccountType;
    private javax.swing.JTextField txtReportCheckingBankName;
    private javax.swing.JTextField txtReportCheckingRoutingNumber;
    private javax.swing.JTextField txtReportCity;
    private javax.swing.JTextField txtReportExpirationDate;
    private javax.swing.JTextField txtReportFirst;
    private javax.swing.JTextField txtReportHeight;
    private javax.swing.JTextField txtReportIssueDate;
    private javax.swing.JTextField txtReportLast;
    private javax.swing.JTextField txtReportLicenseNumber;
    private javax.swing.JTextField txtReportMedicalNumber;
    private javax.swing.JTextField txtReportPhone;
    private javax.swing.JTextField txtReportSavingAccountBalance;
    private javax.swing.JTextField txtReportSavingAccountNumber;
    private javax.swing.JTextField txtReportSavingAccountType;
    private javax.swing.JTextField txtReportSavingBankName;
    private javax.swing.JTextField txtReportSavingRoutingNumber;
    private javax.swing.JTextField txtReportSsn;
    private javax.swing.JTextField txtReportState;
    private javax.swing.JTextField txtReportStreet;
    private javax.swing.JTextField txtReportWeight;
    private javax.swing.JTextField txtReportZip;
    // End of variables declaration//GEN-END:variables
    private void displayRecord(){
        txtReportFirst.setText(demographic.getFirstName());
        txtReportLast.setText(demographic.getLastName());
        txtReportBirthDate.setText(demographic.getBirthDate());
        txtReportAge.setText(demographic.getAge());
        txtReportHeight.setText(demographic.getHeight());
        txtReportWeight.setText(demographic.getWeight());
        txtReportSsn.setText(demographic.getSocialNumber());
        txtReportPhone.setText(demographic.getPhoneNumber());
        
        
        txtReportStreet.setText(address.getStreet());
        txtReportCity.setText(address.getCity());
        txtReportState.setText(address.getState());
        txtReportZip.setText(address.getZip());
        
        
        txtReportSavingBankName.setText(saving.getSavingBankName());
        txtReportSavingRoutingNumber.setText(saving.getSavingRoutingNumber());
        txtReportSavingAccountNumber.setText(saving.getSavingAccountNumber());
        txtReportSavingAccountBalance.setText(saving.getSavingAccountNumber());
        txtReportSavingAccountType.setText(saving.getSavingAccountType());
        
        txtReportCheckingBankName.setText(checking.getCheckingBankName());
        txtReportCheckingAccountNumber.setText(checking.getCheckingAccountNumber());
        txtReportCheckingRoutingNumber.setText(checking.getCheckingRoutingNumber());
        txtReportCheckingAccountBalance.setText(checking.getCheckingAccountBalance());
        txtReportCheckingAccountType.setText(checking.getCheckingAccountType());
        
        
        txtReportLicenseNumber.setText(driverLic.getLicenceNumber());
        txtReportIssueDate.setText(driverLic.getIssueDate());
        txtReportExpirationDate.setText(driverLic.getExpirationDate());
        txtReportBloodType.setText(driverLic.getBloodType());
        
        ImageIcon driverImg = new ImageIcon(driverLic.getFilePath());
        lblReportDriverPic.setIcon(driverImg);
        
        txtReportMedicalNumber.setText(medical.getMedicalNumber());
        txtReportAllergy1.setText(medical.getAllergy1());
        txtReportAllergy2.setText(medical.getAllergy2());
        txtReportAllergy3.setText(medical.getAllergy3());
    }
}
