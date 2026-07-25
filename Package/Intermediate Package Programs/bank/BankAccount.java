package bank;

public class BankAccount {
    double balance ;
    String bankHolder;

    public BankAccount(String bankHolder) {
        this.bankHolder = bankHolder;
    }

    public void deposit (double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successfully..");
        }
        else
            System.out.println("Insafficient Amount must be positive you enter : "+amount);
    }

    public void withdraw (double amount){
        if(amount >=0 && amount <= balance){
            balance -= amount ;
            System.out.println("Amount successfully withdraw.");
        }else{
            System.out.println("Insafficient Amount your balance is  : "+balance);
        }
    }

    public void display(){
        System.out.println("Bank holder name : "+bankHolder);
        System.out.println("Available Balance is : "+ balance);
    }
    
}
