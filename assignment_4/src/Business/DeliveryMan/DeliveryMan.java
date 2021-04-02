/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Dish;
import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String deliveryName;
    private String deliveryUserName;
    private ArrayList<Order> orderList;
    private String DeliveryAddress;
    private String DeliveryNumber;

    public DeliveryMan(String userName, String name){
        this.deliveryUserName = userName;
        this.deliveryName = name;
        orderList = new ArrayList<Order>();
    }
    
    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryUserName() {
        return deliveryUserName;
    }

    public void setDeliveryUserName(String deliveryUserName) {
        this.deliveryUserName = deliveryUserName;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }

    public String getDeliveryNumber() {
        return DeliveryNumber;
    }

    public void setDeliveryNumber(String DeliveryNumber) {
        this.DeliveryNumber = DeliveryNumber;
    }
    
    public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dish> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryManName(deliverMan);
        order.setOrder(Order);
        order.setPrice(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        
    }
    
    
}
