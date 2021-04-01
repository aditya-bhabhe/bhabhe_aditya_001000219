/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Dish;
import Business.Restaurant.Order;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class OrderDetails extends javax.swing.JPanel {

    /**
     * Creates new form OrderDetails
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Order order;
    private EcoSystem ecosystem;
    public OrderDetails(JPanel userProcessContainer, UserAccount userAccount,Order order, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.order = order;
        this.userAccount = userAccount;
        displayOrderDetails();
    }
    
    public void displayOrderDetails(){

         DefaultTableModel tablemodel = (DefaultTableModel) tblOrderDetails.getModel();
         tablemodel.setRowCount(0);
        
         
         Object[] row = new Object[3];
         
                for(Dish dish:order.getOrder()){
                     row[0] = dish.getDishName();
                     row[1] = dish.getDishDescription();
                     row[2] = dish.getPrice();
                     tablemodel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        btnReady = new javax.swing.JButton();
        btnViewOrderBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(214, 208, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Description", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblOrderDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 666, 106));

        btnReady.setBackground(new java.awt.Color(214, 50, 48));
        btnReady.setForeground(new java.awt.Color(255, 255, 255));
        btnReady.setText("Change Status to Ready");
        btnReady.setBorder(null);
        btnReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadyActionPerformed(evt);
            }
        });
        add(btnReady, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 270, 40));

        btnViewOrderBack.setBackground(new java.awt.Color(214, 50, 48));
        btnViewOrderBack.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrderBack.setText("Back");
        btnViewOrderBack.setBorder(null);
        btnViewOrderBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderBackActionPerformed(evt);
            }
        });
        add(btnViewOrderBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadyActionPerformed
        // TODO add your handling code here:
         order.setStatus("Ready to Deliver");
         
        for(Customer cust:ecosystem.getCustomerDirectory().getCustomerDirectory()){
            if(order.getCustomerName().equals(cust.getName())){
                for(Order order : cust.getOrderList()){
                    order.setStatus("Ready to Deliver");
                    JOptionPane.showMessageDialog(null, "Status Updated Successfully");
                }
            }
        }
    }//GEN-LAST:event_btnReadyActionPerformed

    private void btnViewOrderBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnViewOrderBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReady;
    private javax.swing.JButton btnViewOrderBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables
}
