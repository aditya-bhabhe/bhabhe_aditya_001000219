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
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantDirectory;
    private Restaurant restaurant;
    private Dish dish;
    
    public RestaurantDirectory(){
        restaurantDirectory = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
    public Restaurant createRestaurant(String userName){
        System.out.println(userName);
        restaurant = new Restaurant(userName);
        System.out.println(restaurant);
        restaurantDirectory.add(restaurant);
        return restaurant;
    }
    
    public void updateRestaurant(Restaurant restaurant, String restaurantName,String number, String address){
        System.out.println("aaaa:" + restaurantName);
        restaurant.setRestaurantName(restaurantName);
        restaurant.setRestaurantNumber(number);
        restaurant.setRestaurantAddress(address);
    }
    
    public void deleteRestaurant(String userName){
        for(int i = 0; i < restaurantDirectory.size(); i++){
            if(restaurantDirectory.get(i).getRestaurantUserName().equals(userName) ){
                restaurantDirectory.remove(i);
            }
        }
    }
    
    public Dish addMenu(Restaurant restaurant, String name, String desc, String amt){
        System.out.println("Exception 3");
        dish = new Dish(name, desc,amt);
        restaurant.addItem(dish);
        return dish;
    }
    
    public void removeMenu(Restaurant restaurant, Dish dish){
        restaurant.removeItem(dish);
    }
    
    public Restaurant findRestaurant(String restaurantName){
        System.out.println(restaurantName + "Saurabh");
       for(Restaurant r : restaurantDirectory){
            if(r.getRestaurantUserName().equals(restaurantName) ){
                return r;
            }
        }
       return null;
    }
}
