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
public class City {
    private ArrayList<Community> communityDirectory = new ArrayList<Community>();
    private Community community; 
    private int abnormalBloodPressure;
    
    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
        communityDirectory.add(community);
    }
    
    public int abnormalCasesInCity(){
        abnormalBloodPressure=0;
        for(Community c:communityDirectory){
            abnormalBloodPressure+=c.abnormalCasesInCommunity();
        }
        return abnormalBloodPressure;
    }
    
}
