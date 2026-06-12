// 22. Write a Java program to create class Book with details and display them.

class Book{
    String name,authorname,publisher;
    int price;
    String publishdate;

    public Book() {
        name="Java programing";
        authorname="Anish prabhakar";
        publisher="Anish Gupta ";
        price=500;
        publishdate="10-05-2026";      
    }

    void display(){
        System.out.println("......Books Details......");
        System.out.println("Book Name : "+name);
        System.out.println("Book Authorname : "+authorname);
        System.out.println("Book Publisher : "+publisher);
        System.out.println("Book Price : "+price );
        System.out.println("Book PublishDate : "+publishdate);
    }
    
}

public class BookDetails {
    public static void main(String[] args) {
        
        Book B= new Book();
        B.display();
    }
}
