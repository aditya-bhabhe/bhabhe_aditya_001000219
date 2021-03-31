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
    private ArrayList<DeliveryMan> deliveryManDirectory = new ArrayList();
    private DeliveryMan newDeliveryMan = new DeliveryMan(); 
    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan addDeliveryMan(){
        deliveryManDirectory.add(newDeliveryMan);
        return newDeliveryMan;
    }
    
//    public void removeDeliveryMan(String name){
//        for(DeliveryMan d : deliveryManDirectory){
//            if(d.getDeliverManName() == name){
//                deliveryManDirectory.remove(d);
//            }
//        }
//    }
}
