/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Dish;
import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private String userName;
    private ArrayList<Order> orderList;
    private String address;
    private String number;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    public Customer(String userName, String name){
        this.userName = userName;
        this.name = name;
        orderList=new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    int id = 1;
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Dish> Order, String price, String deliveryAddress) {
        Order order=new Order();
        order.setOrderId(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurentName);
        order.setDeliveryManName(deliverMan);
        order.setOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
}
