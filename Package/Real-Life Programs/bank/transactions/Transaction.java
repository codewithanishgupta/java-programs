package bank.transactions;

import bank.accounts.Account;

public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type , double amount , Account account) {
        this.type = type ;
        this.amount = amount ;

        if (type.equalsIgnoreCase("deposit")){
            account.deposit(amount);
        }else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        }
    }

    
}
