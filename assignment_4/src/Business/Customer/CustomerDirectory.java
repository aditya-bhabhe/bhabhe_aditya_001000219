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
    
    private ArrayList<Customer> customerDirectory;
    private Customer customer;
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer createUserAccount(String username, String name){
        customer = new Customer(username,name);
        System.out.println(customer);
        customerDirectory.add(customer);
        return customer;
    }
    
    
    public void deleteCustomer(String username){
        System.out.println(username);
        for(Customer cust : customerDirectory){
            if(cust.getUserName().equals(username)){
                customerDirectory.remove(cust);
            }
        }
    }
    
}
