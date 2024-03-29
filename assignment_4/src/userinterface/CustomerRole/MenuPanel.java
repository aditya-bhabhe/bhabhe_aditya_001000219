/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Organization;
import Business.Restaurant.Dish;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class MenuPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Restaurant restaurant;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    ArrayList<Dish> item=new ArrayList<Dish>();
    int sum = 0;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public MenuPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, Restaurant restaurant) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        this.userAccount = account;
        System.out.println(restaurant);
       displayMenuTable();
    }
    
    public void displayMenuTable(){
         DefaultTableModel table = (DefaultTableModel) tblMenu.getModel();
        
            table.setRowCount(0);
                Object[] row = new Object[4];
                for(Dish dish:restaurant.getMenuList()){
                     row[0] = dish;
                     row[1] = dish.getDishName();
                     row[2] = dish.getDishDescription();
                     row[3] = dish.getPrice();
                     table.addRow(row);
                } 
    }
    
    public void displayCart(){
        DefaultTableModel table = (DefaultTableModel) tblCart.getModel();
        table.setRowCount(0);
         Object[] row = new Object[4];
                for(Dish dishItem:item){
                     row[0] = dishItem;
                     row[1] = dishItem.getDishName();
                     row[2] = dishItem.getDishDescription();
                     row[3] = dishItem.getPrice();
                     table.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        lblCart = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(214, 208, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemove.setBackground(new java.awt.Color(214, 50, 48));
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove Item");
        btnRemove.setBorder(null);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 110, 40));

        jLabel1.setText("Location:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 80, 30));
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 150, 30));

        backJButton.setBackground(new java.awt.Color(214, 50, 48));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, 40));

        lblCart.setText("<value>");
        add(lblCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Your Cart :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 120, 30));

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Description", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblMenu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 670, 110));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Id", "Item Name", "Description", "Price"
            }
        ));
        jScrollPane3.setViewportView(tblCart);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 670, 110));

        btnOrder.setBackground(new java.awt.Color(214, 50, 48));
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Order");
        btnOrder.setBorder(null);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 110, 40));

        btnAdd1.setBackground(new java.awt.Color(214, 50, 48));
        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setText("Add Item");
        btnAdd1.setBorder(null);
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        int focusRow = tblCart.getSelectedRow();
        if(focusRow<0){
            JOptionPane.showMessageDialog(null,"Please select a dish from the table to remove from cart","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dish dish=(Dish)tblCart.getValueAt(focusRow, 0);
            sum=sum-Integer.parseInt(dish.getPrice());
            item.remove(dish);
            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);
           displayCart();
                }  
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        
        if(txtLocation.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the location for the delivery");
        }else{
             String address=txtLocation.getText();
        restaurant.addOrder(restaurant.getRestaurantName(), userAccount.getUsername(), null, item, String.valueOf(sum) , address);
        for(Customer customer:ecosystem.getCustomerDirectory().getCustomerDirectory()){
            if(userAccount.getUsername().equals(customer.getUserName())){
                
                customer.addOrder(restaurant.getRestaurantName(), userAccount.getUsername(), null, item, String.valueOf(sum) , address);
                JOptionPane.showMessageDialog(null, "You Order placed successfully");
            }
        }
        }
        sum = 0;
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        int focusRow = tblMenu.getSelectedRow();
        if(focusRow<0){
            JOptionPane.showMessageDialog(null,"Please select a dish from the table to add","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dish dish=(Dish)tblMenu.getValueAt(focusRow, 0);
            sum=sum+Integer.parseInt(dish.getPrice());
            item.add(dish);
            displayCart();
          
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCart;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtLocation;
    // End of variables declaration//GEN-END:variables
}
