// 35. Write a program to validate age using encapsulation. 

class BankAccount {

    private String holderName;
    private int age;
    private double balance;

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setAge(int age) {
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid Age! Account holder must be 18 or older.");
        }
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    public String getHolderName() {
        return holderName; 
    }
    public int getAge() { 
        return age; 
    }
    public double getBalance() { 
        return balance; 
    }

    public void showDetails() {
        System.out.println("===== Account Details =====");
        System.out.println("Holder Name : " + holderName);
        System.out.println("Age         : " + age);
        System.out.println("Balance     : Rs." + balance);
    }
}

public class Q35 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.setHolderName("Anish Gupta");
        a1.setAge(21);   // valid age
        a1.setBalance(5000);
        a1.showDetails();

        BankAccount a2 = new BankAccount();
        a2.setHolderName("Rahul Kumar");
        a2.setAge(16);   // invalid age → validation message
        a2.setBalance(3000);
        a2.showDetails();
    }
}
