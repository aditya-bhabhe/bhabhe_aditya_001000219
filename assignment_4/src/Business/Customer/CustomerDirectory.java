/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList = new ArrayList();
    private Customer findCustomer;
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(String name){
        for(Customer i : customerList){
            if(i.getCustomerName() == name){
                customerList.add(i);
                findCustomer = i;
            }
        }

        return findCustomer;
    }
    
    public void removeCustomer(String name){
        for(Customer i : customerList){
            if(i.getCustomerName() == name){
                customerList.remove(i);
            }
        }
    }
    
}
