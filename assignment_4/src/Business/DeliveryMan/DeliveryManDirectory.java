/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;
    private DeliveryMan deliveryMan;
    
    public DeliveryManDirectory(){
        this.deliveryManDirectory =  new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    public DeliveryMan createDeliveryMan(String userName, String name){
        deliveryMan = new DeliveryMan(userName, name);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(String userName){
        for(int i=0;i<deliveryManDirectory.size();i++){
            if(deliveryManDirectory.get(i).getDeliveryUserName() == userName){
                deliveryManDirectory.remove(i);
            }
        }
    }
    

}
