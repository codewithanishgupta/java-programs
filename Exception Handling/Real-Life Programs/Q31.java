// 31.Library Management System using exception handling.

class LibraryException extends Exception {
    public LibraryException(String message) {
        super(message);
    }
}

class Library {
    private int totalBooks;

    public Library(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public void issueBook(int books) throws LibraryException {
        if (books <= 0) {
            throw new LibraryException("Invalid number of books to issue.");
        } else if (books > totalBooks) {
            throw new LibraryException("Not enough books available. Current stock: " + totalBooks);
        } else {
            totalBooks -= books;
            System.out.println("Book issued successfully. Remaining books: " + totalBooks);
        }
    }

    public void returnBook(int books) throws LibraryException {
        if (books <= 0) {
            throw new LibraryException("Invalid number of books to return.");
        } else {
            totalBooks += books;
            System.out.println("Book returned successfully. Current stock: " + totalBooks);
        }
    }
}

public class Q31 {
    public static void main(String[] args) {
        System.out.println("--------- Library Management System ----------");

        Library library = new Library(5);

        try {
            library.issueBook(2);
            library.issueBook(10);
        } catch (LibraryException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            library.returnBook(-1);
        } catch (LibraryException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            library.returnBook(3);
        } catch (LibraryException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}