package bank.services;

import bank.accounts.Account;
import java.util.HashMap;

public class BankService {
    public HashMap<String,Account> accounts = new HashMap<>();

    public void addAccount (Account account){
        accounts.put(account.getAccountNumbar(), account);
    }

    public Account getAccount (String accountNumber){
        return accounts.get(accountNumber);
    }
}
 