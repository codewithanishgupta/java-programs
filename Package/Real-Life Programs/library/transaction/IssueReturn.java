package library.transactions;

import library.books.Book;
import library.members.Member;

public class IssueReturn {
    public void issueBook(Book book, Member member) {
        if(!book.isIssued()) {
            book.setIssued(true);
            System.out.println("Book '" + book.getTitle() + "' issued to " + member.getName());
        } else {
            System.out.println("Book already issued!");
        }
    }

    public void returnBook(Book book, Member member) {
        if(book.isIssued()) {
            book.setIssued(false);
            System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());
        } else {
            System.out.println("Book was not issued!");
        }
    }
}
