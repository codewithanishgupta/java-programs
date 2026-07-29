package bank.accounts;

import bank.customers.Customer;

public class CurrentAccount extends Account {
    public double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber , Customer customer) {
        super(accountNumber, customer);
    }
    
    @Override
    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successfully!");
        }else{
            System.out.println("Amount must be positive! You enter : "+amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(balance + overdraftLimit >= amount){
            balance -= amount;
            System.out.println("Withdraw sucessfully!");
        } 
        else System.out.println("Overdraft limit exceeded!");
    }
}
