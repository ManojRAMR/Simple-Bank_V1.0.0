package com.company;

import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName){
        this.name = branchName;
        customers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transactionAmount){
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName){
        for (Customer customer : customers){
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }

        return null;
    }
}
