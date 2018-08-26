/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Rishi Nandedkar
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerDirectory;

    public CustomerDirectory() {
        customerDirectory = new ArrayList<>();
    }
    
     public Customer createCustomer(String name){
        Customer customer = new Customer();
        customer.setName(name);
        customerDirectory.add(customer);
        return customer;
    }
}
