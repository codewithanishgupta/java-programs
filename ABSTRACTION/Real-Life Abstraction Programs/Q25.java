// 25.Write a Java program to create an abstract class Library with methods issueBook() and returnBook().

abstract class Library {
    abstract void issueBook(String bookName);
    abstract void returnBook(String bookName);
}

class PublicLibrary extends Library {
    @Override
    void issueBook(String bookName) {
        System.out.println("Book '" + bookName + "' has been issued.");
    }

    @Override
    void returnBook(String bookName) {
        System.out.println("Book '" + bookName + "' has been returned.");
    }
}

class CollegeLibrary extends Library {
    @Override
    void issueBook(String bookName) {
        System.out.println("College Library issued: " + bookName);
    }

    @Override
    void returnBook(String bookName) {
        System.out.println("College Library returned: " + bookName);
    }
}
public class Q25 {
    public static void main(String[] args) {
        Library lib1 = new PublicLibrary();
        lib1.issueBook("Java Programming");
        lib1.returnBook("Java Programming");

        Library lib2 = new CollegeLibrary();
        lib2.issueBook("Data Structures");
        lib2.returnBook("Data Structures");
    }
}
