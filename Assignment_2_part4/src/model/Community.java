/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class Community {
    private ArrayList<House> houseDirectory = new ArrayList<House>();
    private House house;
    private int countAbnormalitiesInCommunity;
    
    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
        houseDirectory.add(house);
    }
    
    public int abnormalCasesInCommunity(){
        countAbnormalitiesInCommunity = 0;
        for(House h:houseDirectory){
            countAbnormalitiesInCommunity+=h.abnormalCasesInHouse();
        }
        return countAbnormalitiesInCommunity;
    }
}
