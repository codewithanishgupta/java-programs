// 7.Create a package library with classes:Book,Library 

import library.*;

public class Q7 {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", 450.0);
        Book b2 = new Book("DSA in Java", "Robert Lafore", 600.0);

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();
    }
}
