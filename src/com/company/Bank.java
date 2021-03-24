package com.company;

import java.util.ArrayList;

public class Bank{
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName){
        this.name = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transactionAmount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            int customerCount = branch.getCustomers().size();
            for (int i = 0; i < customerCount; i++){
                Customer customer = branch.getCustomers().get(i);
                String customerName = customer.getName();
                System.out.println("Customer: " + customerName + "[" + (i + 1) + "]");

                if (printTransactions) {
                    ArrayList<Double> customerTransactions = customer.getTransactions();
                    int customerTransactionsCount = customerTransactions.size();

                    System.out.println("Transactions");
                    for (int j = 0; j < customerTransactionsCount; j++){
                        System.out.println("[" + (j + 1) + "]  Amount " + customerTransactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;

    }

    private Branch findBranch(String branchName){
        for (Branch branch : branches){
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }

        return null;
    }
}
