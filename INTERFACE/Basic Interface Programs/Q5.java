// 5.Create an interface Printable with method print(). Implement it in a class Document. 

interface Printable {
    void print();
}

class Document implements Printable {
    String title;

    public Document(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing Document: " + title);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Printable p = new Document("Java OOP Notes");
        p.print();
    }
}

