package library.main;

import library.books.Book;
import library.members.Member;
import library.services.LibraryService;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();

        Book b1 = new Book("B101", "Java Basics", "James Gosling");
        Book b2 = new Book("B102", "DSA Handbook", "Robert Lafore");

        service.addBook(b1);
        service.addBook(b2);

        Member m1 = new Member("M001", "Anish");

        service.issueBook("B101", m1);
        service.returnBook("B101", m1);
    }
}
