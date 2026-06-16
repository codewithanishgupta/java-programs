// 17.Write a Java program where a class implements two interfaces.

interface Printable {
    void print();
}
interface Showable{
    void show();
}

class Report implements Printable , Showable {
    @Override
    public void print(){
        System.out.println("Printing the Report...");
    }
    @Override
    public void show(){
        System.out.println("Showing the Report...");
    }
}


public class Q17 {
    public static void main(String[] args) {
        Report r = new Report();
        r.print();
        r.show();
    }
}
