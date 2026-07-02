// 15.Create a class that implements three interfaces and demonstrates all methods. 


interface Printable {
    void print();
}

interface Showable {
    void show();
}

interface Shareable {
    void share();
}

class Report implements Printable, Showable, Shareable {
    String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing Report: " + title);
    }

    @Override
    public void show() {
        System.out.println("Showing Report: " + title);
    }

    @Override
    public void share() {
        System.out.println("Sharing Report: " + title);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Report r = new Report("Annual Business Report");

        r.print();
        r.show();
        r.share();
    }
}

