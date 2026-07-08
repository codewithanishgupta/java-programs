// 33.Write a Java program for a library management system using inheritance.


class LibraryItem {
    String title;
    String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("LibraryItem constructor executed...");
    }

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
        System.out.println("Book constructor executed...");
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Pages: " + pages);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
        System.out.println("Magazine constructor executed...");
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class Q33 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling", 500);
        b.showDetails();

        System.out.println("-------------------");

        Magazine m = new Magazine("Tech Monthly", "Editorial Team", 45);
        m.showDetails();
    }
}