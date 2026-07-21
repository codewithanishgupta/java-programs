// 37.Electricity Bill Calculator with exception handling.

class BillException extends Exception {
    public BillException(String message) {
        super(message);
    }
}

class ElectricityBill {
    private String customerName;
    private int units;

    public ElectricityBill(String customerName, int units) throws BillException {
        if (units < 0) {
            throw new BillException("Units cannot be negative.");
        }
        this.customerName = customerName;
        this.units = units;
    }

    public double calculateBill() throws BillException {
        double rate;

        if (units <= 100) {
            rate = 5.0; // Rs. 5 per unit
        } else if (units <= 300) {
            rate = 7.0; // Rs. 7 per unit
        } else if (units <= 500) {
            rate = 10.0; // Rs. 10 per unit
        } else {
            rate = 12.0; // Rs. 12 per unit
        }

        double billAmount = units * rate;

        if (billAmount <= 0) {
            throw new BillException("Bill calculation error.");
        }

        return billAmount;
    }

    public void displayBill() throws BillException {
        double amount = calculateBill();
        System.out.println("Customer: " + customerName + " | Units: " + units + " | Bill Amount: Rs. " + amount);
    }
}

public class Q37 {
    public static void main(String[] args) {
        System.out.println("--------- Electricity Bill Calculator ----------");

        try {
            ElectricityBill bill1 = new ElectricityBill("Anish", 250);
            bill1.displayBill();

            ElectricityBill bill2 = new ElectricityBill("Ravi", -50);
            bill2.displayBill();

        } catch (BillException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            ElectricityBill bill3 = new ElectricityBill("Raju", 600);
            bill3.displayBill();
        } catch (BillException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}