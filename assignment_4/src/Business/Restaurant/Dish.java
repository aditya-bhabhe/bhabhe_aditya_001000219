/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author adity
 */
public class Dish {
    private String dishName;
    private String dishDescription;
    private String price;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    
    public Dish(String dishName, String dishDescription, String price){
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.price = price;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public String returnDishName(){
        return dishName;
    }
}
