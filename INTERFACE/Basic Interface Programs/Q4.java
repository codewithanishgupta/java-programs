// 4.Create an interface Bank with method getInterestRate(). Implement it in classes SBI, HDFC,
//  and ICICI. 

interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    @Override
    public double getInterestRate() {
        return 3.8;
    }
}
class HDFC implements Bank {
    @Override
    public double getInterestRate() {
        return 7.2;
    }
}

class ICICI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.8;
    }
}
public class Q4 {
    public static void main(String[] args) {
    Bank[] banks = { new SBI(), new HDFC(), new ICICI() };
        for (Bank b : banks) {
            System.out.println(b.getClass().getSimpleName() + " Interest Rate : " + b.getInterestRate() + "%");
        }
    }
}
