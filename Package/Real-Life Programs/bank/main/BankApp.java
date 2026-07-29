package bank.main;

import bank.customers.Customer;
import bank.accounts.SavingAccount;
import bank.accounts.CurrentAccount;
import bank.services.BankService;
import bank.transactions.Transaction;

import java.security.Provider;

public class BankApp {
    public static void main(String[] args) {
    Customer c1 = new Customer("Anish Gupta", "A007");

    SavingAccount sa = new SavingAccount("A1001", c1);
    BankService service = new BankService();
    service.addAccount(sa);

    new Transaction ("deposit",2000,sa);
    new Transaction ("withdraw",500,sa);

    System.out.println("Final Balance : "+sa.getBalance());

    CurrentAccount ca = new CurrentAccount("A346",c1);
    service.addAccount(ca);

    new Transaction("Deposit",3450,ca);
        System.out.println("Fianal Balance of Current acount : "+ca.getBalance());

    new Transaction("Withdraw",2000,ca);
        System.out.println("Final Balance of Current account : "+ca.getBalance());

    }
}
