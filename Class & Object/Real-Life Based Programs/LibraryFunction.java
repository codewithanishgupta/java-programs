// 28. Write a Java program to create class Library to store book details.

class Library{
    String name[];
    int number[];
    int count=0;

    Library(int size) {
        name=new String[size];
        number=new int[size];
        count=0;
    }
    void addBook(String name,int number){
        if(count<this.name.length){
            this.name[count]=name;
            this.number[count]=number;
            count++;
        }else{
            System.out.println("Library is full, cannot store more books");
        }
    }
    void display(){
        for(int i=0;i<count;i++){
            System.out.println((i+1)+".Book name  "+name[i]+" store at locker no. : "+number[i]);
        }
        
    }
}

public class LibraryFunction {
    public static void main(String[] args) {
        Library L=new Library(2);
        L.addBook("C++",410);
        L.addBook("Java", 355);
        L.addBook("Computer-Graphics", 111);
        L.display();
    }
}
