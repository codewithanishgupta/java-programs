// 20.Write a Java program to combine multiple interfaces in a single class.


interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class MultiFunctionMachine implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Sending fax...");
    }
}

public class Q20 {
    public static void main(String[] args) {
        MultiFunctionMachine mfm = new MultiFunctionMachine();

        mfm.print();
        mfm.scan();
        mfm.fax();

        Printer p = mfm;
        p.print();

        Scanner s = mfm;
        s.scan();

        Fax f = mfm;
        f.fax();
    }
}
