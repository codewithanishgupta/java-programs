// 6.Create a package bank containing a class BankAccount with methods: Deposit,Withdraw,Display Balance 

import bank.BankAccount;

public class Q6 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Anish");
        b.deposit(3460);
        b.display();
        b.withdraw(3456);
        b.display();
    }
}