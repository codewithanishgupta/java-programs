package library.books;

import java.util.HashMap;

public class BookCatalog {
    private HashMap<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public Book getBook(String bookId) {
        return books.get(bookId);
    }
}