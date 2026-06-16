// 18.Write a Java program to create interfaces Printer and Scanner and implement both in a class.


interface Printer{
    void print();
}
interface Scanner {
    void scan();
}

class Document implements Printer , Scanner {
    @Override
    public void print(){
        System.out.println("Printing Document.... ");
    }
    @Override
    public void scan(){
        System.out.println("Scanning Document...");
    }
}

public class Q18 {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        d.scan();

        // Polymorphism demo

        Printer p = new Document();
        p.print();
        Scanner s = new Document();
        s.scan();
    }
}
