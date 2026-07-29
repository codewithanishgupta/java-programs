package bank.accounts;

import bank.customers.Customer;

public class SavingAccount extends Account {
    private double interestRate = 0.03 ;

    public SavingAccount(String accountNumber , Customer customer) {
        super(accountNumber , customer);
    }

    @Override
    public void deposit (double amount){
        if(amount > 0){
            balance += amount + (amount * interestRate);
            System.out.println("Deposit successfully!");
        }else{
            System.out.println("Amount must be positive! You enter : "+amount);
        }
    }

    @Override
    public void withdraw (double amount) {
        if(balance >= amount){
            balance -= amount ;
            System.out.println("Withdraw sucessfully!");
        }else{
            System.out.println("Insufficient founds!");
        }
    }
}
