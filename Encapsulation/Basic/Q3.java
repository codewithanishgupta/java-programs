// 3.Create a Book class with private title and author. 


import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        System.out.print("Enter Book Title : ");
        b.setTitle(sc.nextLine());

        System.out.print("Enter Book Author : ");
        b.setAuthor(sc.nextLine());

        System.out.println("====== Book Details ======");
        System.out.println("Title : " + b.getTitle());
        System.out.println("Author : " + b.getAuthor());
    }
}

