/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private String restaurantUserName;
    private String restaurantAddress;
    private String restaurantNumber;
    private ArrayList<Dish> menuList;
    private ArrayList<Order> orderList;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantUserName() {
        return restaurantUserName;
    }

    public void setRestaurantUserName(String restaurantUserName) {
        this.restaurantUserName = restaurantUserName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public ArrayList<Dish> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Dish> menuList) {
        this.menuList = menuList;
    }
    
    public void addItem(Dish dish){
        menuList.add(dish);
    }
    
    public void removeItem(Dish dish){
        menuList.remove(dish);
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Restaurant(String restaurantUserName){
        this.restaurantUserName = restaurantUserName;
        menuList = new ArrayList<Dish>();
        orderList = new ArrayList<Order>();
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
