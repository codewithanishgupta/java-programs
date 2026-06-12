class Bank {
    private String name;
    private int balance;

    public String getBankName() {
        return name;
    }
    public int getBankBalance() {
        return balance;
    }

    public void setBankName(String name) {
        this.name = name;
    }
    public void setBankBalance(int balance) {
        this.balance = balance;
    }
}

class EncapsulationSimple {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBankName("State Bank Of India");
        b.setBankBalance(5000);

        System.out.println("Bank name    : " + b.getBankName());
        System.out.println("Bank Balance : " + b.getBankBalance());
    }
}






/*class Bank {
    // 🔒 Private variables
    private String bankName;
    private int balance;

    // ✅ Getter methods
    public String getBankName() {
        return bankName;
    }

    public int getBalance() {
        return balance;
    }

    // ✅ Setter methods
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBalance(int balance) {
        if(balance >= 0) {   // validation
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Bank b = new Bank();

        // Using setters to assign values
        b.setBankName("State Bank Of India");
        b.setBalance(5000);

        // Using getters to access values
        System.out.println("Bank Name: " + b.getBankName());
        System.out.println("Balance  : " + b.getBalance());
    }
} */
