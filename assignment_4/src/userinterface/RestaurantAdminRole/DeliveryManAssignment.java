/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
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
public class DeliveryManAssignment extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManAssignment
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private Order order;
    public DeliveryManAssignment(JPanel userProcessContainer, UserAccount account, Order order, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.order = order;
        this.ecosystem = ecosystem;
        displayDeliveryManTable();
    }
    
    
    public void displayDeliveryManTable(){
        DefaultTableModel tablemodel = (DefaultTableModel) tblDeliveryMan.getModel();
        
        tablemodel.setRowCount(0);
        
        for(DeliveryMan deliveryMan:ecosystem.getDeliveryManDirectory().getDeliveryManDirectory()){
               Object[] row = new Object[2];
               row[0] = deliveryMan;
               row[1] = deliveryMan.getDeliveryName();
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
        tblDeliveryMan = new javax.swing.JTable();
        btnRestaurantBack = new javax.swing.JButton();
        btnDeliveryUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(214, 208, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Id", "User Name"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryMan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 70, 661, 101));

        btnRestaurantBack.setBackground(new java.awt.Color(214, 50, 48));
        btnRestaurantBack.setForeground(new java.awt.Color(255, 255, 255));
        btnRestaurantBack.setText("Back");
        btnRestaurantBack.setBorder(null);
        btnRestaurantBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantBackActionPerformed(evt);
            }
        });
        add(btnRestaurantBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 120, 40));

        btnDeliveryUpdate.setBackground(new java.awt.Color(214, 50, 48));
        btnDeliveryUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnDeliveryUpdate.setText("Assign to Delivery Man");
        btnDeliveryUpdate.setBorder(null);
        btnDeliveryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryUpdateActionPerformed(evt);
            }
        });
        add(btnDeliveryUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 270, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to assign the order","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            DeliveryMan deliveryMan  = (DeliveryMan)tblDeliveryMan.getValueAt(selectedRow, 0);   
            deliveryMan.getOrderList().add(order);
            order.setStatus("Assigned to Deliveryman");
            JOptionPane.showMessageDialog(null, "Assigned to Delivery Man");
            
        }
    }//GEN-LAST:event_btnDeliveryUpdateActionPerformed

    private void btnRestaurantBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnRestaurantBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeliveryUpdate;
    private javax.swing.JButton btnRestaurantBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryMan;
    // End of variables declaration//GEN-END:variables

   
}
