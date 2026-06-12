// 41.Create a Wallet class with addMoney() and spendMoney(). 

class Wallet{
    private double balance;

    public Wallet(double initialBalance) {
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance! Setting to 0.");
            this.balance = 0;
        }
    }
    
    public void addMoney(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Added Rs." + amount + " to wallet.");
        } else {
            System.out.println("Amount must be positive!");
        }
    }
    public void spendMoney(double amount){
       if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent Rs." + amount + " from wallet.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void show(){
        System.out.println("Your balance is : "+balance);
    }
}

public class Q41 {
    public static void main(String[] args) {
        Wallet wl= new Wallet(200);
        wl.addMoney(4900);
        wl.show();
        wl.spendMoney(700);
        wl.show();
    }
}
