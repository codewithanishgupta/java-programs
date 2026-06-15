// 11.Write a Java program to create an interface Printable and implement it in a class.

interface Printable{
    void print();   // public and abstract
}

class Document implements Printable {
    String title;

    public Document(String title) {
        this.title=title;
    }

    @Override
    public void print(){
        System.out.println("Printing Document......");
    }
 
}

public class Q11{
    public static void main(String[] args) {
        Printable p = new Document("Java interface notes..");
        p.print();
    }
}