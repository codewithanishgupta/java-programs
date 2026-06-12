// 29. Create a Library Management System with book issue and return. 

import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title , String author) {
        this.title = title;
        this.author=author;
        this.isIssued = false;
    }

    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }

    boolean isIssued(){
        return isIssued;
    }

    public void issueBook(){
        if(!isIssued){
            isIssued= true;
            System.out.println("Book '" + title + "' issued successfully!");
        } else {
            System.out.println("Book '" + title + "' is already issued.");
        }
    }

    public void returnBook(){
        if(isIssued) {
            isIssued = false;
            System.out.println("Book '" + title + "' returned successfully!");
        } else {
            System.out.println("Book '" + title + "' was not issued.");
        }
    }

    public void showDetails(){
        System.out.println("Title : " + title + ", Author : " + author);
        System.out.println("Status : " + (isIssued ? "Issued" : "Available \n"));
    }
    
}

class Library{
    private Book books[];

    public Library(int size) {
        books=new Book[size];
    }

    public void addBook(int index , Book b){
        if(index>=0 && index<books.length){
            books[index]=b;
            System.out.println("Book Add successfully!");
        }
    }

    public void showAllBooks(){
        System.out.println("=====Library Books=====");
        for(Book b : books){
            if(b != null)
                b.showDetails();
        }
    }

    public void issueBook(String title) {
        for(Book b : books) {
            if(b != null && b.getTitle().equalsIgnoreCase(title)) {
                b.issueBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }

     public void returnBook(String title) {
        for(Book b : books) {
            if(b != null && b.getTitle().equalsIgnoreCase(title)) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }
    
}

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Library : ");
        int n = sc.nextInt();
        Library Lib = new Library(n);

         int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add new Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch(choice){
                case 1:{
                    System.out.print("Enter Book title : ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book index : ");
                    int index= sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book author : ");
                    String author = sc.nextLine();
                    Lib.addBook(index, new Book(title, author));
                    break;
                }

                case 2 :    Lib.showAllBooks(); break;

                case 3 :{
                    System.out.print("Enter book title to issue: ");
                    String title = sc.nextLine();
                    Lib.issueBook(title);
                    break;
                }

                case 4 : {
                    System.out.print("Enter book title to return : ");
                    String title=sc.nextLine();
                    Lib.returnBook(title);
                    break;
                }

                case 5 :    System.out.println("Thank you for using library management System !"); break;

                default :   System.out.println("Worng choice Try again.....!");
            }    
        }while(choice != 5);
    }
}
