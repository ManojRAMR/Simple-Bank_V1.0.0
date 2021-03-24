package com.company;

public class Main{

    public static void main(String[] args){
        // write your code here
        Bank bank = new Bank("Bank of Cyelon");

        bank.addBranch("Kurunegala Super");

        bank.addCustomer("Kurunegala Super", "Manoj", 1230420.2);
        bank.addCustomer("Kurunegala Super", "Chamith", 130420.2);
        bank.addCustomer("Kurunegala Super", "Dulaj", 12420.2);

        bank.addCustomerTransaction("Kurunegala Super", "Manoj", 232343.44);
        bank.addCustomerTransaction("Kurunegala Super", "Manoj", 2343.66);
        bank.addCustomerTransaction("Kurunegala Super", "Chamith", 23476);

        bank.listCustomers("Kurunegala Super", true);

    }
}
