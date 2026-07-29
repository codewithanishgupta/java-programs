package bank.accounts;

import bank.customers.Customer;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected Customer customer;

    public Account(String accountNumber , Customer customer) {
        this.accountNumber = accountNumber ;
        this.customer = customer ;
        this.balance = 0.0 ;
    }

    public abstract void deposit (double amount);
    public abstract void withdraw (double amount);

    public double getBalance () {
        return balance ;
    }

    public String getAccountNumbar () {
        return accountNumber ;
    }
    
}
