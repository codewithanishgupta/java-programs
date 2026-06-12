// 31. Demonstrate data hiding using private variables. 

class Bank{
    private long accountNumber;
    private int balance;
    private String holderName;

    public void setAccountNumbar(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setHolderName(String holderName){
        this.holderName= holderName;
    }

    public void show(){
        System.out.println("=====Customer Details====");
        System.out.println("Bank Holder Name : "+ holderName);
        System.out.println("AccountNumbar : "+accountNumber);
        System.out.println("balamce : "+balance);
    }

}

public class Q31 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setAccountNumbar(452368954456l);
        b.setHolderName("Anish Gupta");
        b.setBalance(5400);
        b.show();
    }
}
