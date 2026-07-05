
import java.util.ArrayList;

// 26.Library Management System using interfaces. 

interface Library {
    void addBook( String bookName);
    void issueBook( String bookName);
    void returnBook( String bookName);
    void  showAvailableBook();
}

class LibraryManagement implements Library {
    int id;
    String name;
    ArrayList<String> books = new ArrayList<>();
    @Override
    public void addBook(String bookName){
        books.add(bookName);
        System.out.println(bookName+" Added to the Library");
    }
    @Override
    public void issueBook( String bookName){
        if(books.contains(bookName)){
               books.remove(bookName);
            System.out.println(bookName+" has been issued.");
        }else{
            System.out.println(bookName+" is not available in the Library");
        }
    }
    @Override
    public void returnBook (String bookName){
        books.add(bookName);
        System.out.println(bookName+" has been returned.");
    }
    @Override
    public void showAvailableBook(){
        System.out.println("\n-------------Available Books in Lybrary-------------");
        for(String book : books){
            System.out.println("-> "+book);
        }
        System.out.println();
    }
}


public class Q26 {
    public static void main(String[] args) {
        Library lib = new LibraryManagement();
        
        lib.addBook("Java Programming");
        lib.addBook("Operating System & Linux");
        lib.addBook("Computer Graphics");
        lib.addBook("Software Engineering Principles");

        lib.showAvailableBook();

        lib.issueBook("Computer Graphics");
        lib.showAvailableBook();

        lib.issueBook("Java Programming");
        lib.showAvailableBook();

        lib.returnBook("Java Programming");
        lib.showAvailableBook();


    }
}