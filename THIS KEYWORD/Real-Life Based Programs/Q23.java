// 23.Write a Java program to create class BankAccount using this for deposit/withdraw methods.


class BankAccount{
    int blance;
    String bankHolder;

    public BankAccount(int blance , String bankHolder) {
        this.blance =blance;
        this.bankHolder=bankHolder;
    }

    void deposit(int blance){
        this.blance+=blance;
    }

    void withdeaw(int blance){
        this.blance-=blance;
    }

    void show(){
        System.out.println("----------BankAccount Details------------");
        System.out.println("BankHolder name : "+bankHolder);
        System.out.println("Balance : "+blance);
    }
    
}


public class Q23 {
    public static void main(String[] args) {
        BankAccount b= new BankAccount(2300, "Anish Prabhakar");
        b.show();
        b.deposit(3000);
        b.show();
        b.withdeaw(300);
        b.show();
    }
}
