package library.services;

import library.books.BookCatalog;
import library.books.Book;
import library.members.Member;
import library.transactions.IssueReturn;

public class LibraryService {
    private BookCatalog catalog = new BookCatalog();
    private IssueReturn issueReturn = new IssueReturn();

    public void addBook(Book book) {
        catalog.addBook(book);
    }

    public void issueBook(String bookId, Member member) {
        Book book = catalog.getBook(bookId);
        if(book != null) issueReturn.issueBook(book, member);
        else System.out.println("Book not found!");
    }

    public void returnBook(String bookId, Member member) {
        Book book = catalog.getBook(bookId);
        if(book != null) issueReturn.returnBook(book, member);
        else System.out.println("Book not found!");
    }
}
