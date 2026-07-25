package library;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}
