// 11.Create two interfaces Printable and Showable. Implement both interfaces in a class Report. 

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Report implements Printable , Showable {
    String title;

    public Report(String title) {
        this.title = title;
    }
    @Override
    public void print(){
        System.out.println("Report Printing : "+title);
    }
    @Override
    public void show(){
        System.out.println("Report Showing : "+title);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Report r= new Report("Finance Report");
        r.print();
        r.show();
    }
}