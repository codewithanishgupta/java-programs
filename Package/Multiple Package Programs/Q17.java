// 17.Create two packages: bank , customer Access classes from both packages.

import bank.Bank;
import customer.Costomer;

public class Q17 {
    public static void main(String[] args) {
        Bank b = new Bank();
        Costomer c = new Costomer();

        System.out.println("====== Bank Details ========");
        b.bankDetails();

        System.out.println("-------- Costomer Details ---------");
        c.costomerDetails();
    }
}
