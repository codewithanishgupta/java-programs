// 6. Write a Java program to create an abstract class Bank with an abstract method getInterestRate() and implement it in different bank classes.

abstract class Bank {
    String name;

    public Bank(String name) {
        this.name=name;
    } 
    abstract double getInterestRate();
    void display(){
        System.out.println("Bank Name : "+name);
        System.out.println("Interest Rate : "+getInterestRate());
    }
}

class StateBankOfIndia extends  Bank {

    public StateBankOfIndia() {
        super("State Bank Of India");
    }

    double getInterestRate(){
        return 5.7;
    }
}

class BankOfBroda extends Bank {

    public BankOfBroda() {
        super("Bank Of Broda");
    }

    
    double getInterestRate(){
        return 4.6;
    }
}

public class Q6 {
    public static void main(String[] args) {
        StateBankOfIndia SBI = new StateBankOfIndia();
        SBI.display();

        BankOfBroda BOB = new BankOfBroda();
        BOB.display();
    }
}