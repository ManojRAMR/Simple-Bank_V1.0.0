package com.company;

import java.util.ArrayList;

public class Customer{
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialTransaction){
        this.name = customerName;
        transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

}
