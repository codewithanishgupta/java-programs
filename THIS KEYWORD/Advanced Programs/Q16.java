// 16.Write a Java program to demonstrate this keyword in inheritance (child referring to itself).


class Parent{
    int x;
    String name;

    public Parent(int x , String name) {
        this.x=x;
        this.name=name;
    }
    void show(){
        System.out.println("X : "+x);
        System.out.println("Name : "+name);
    }
    
}
class Child extends Parent{
    int x;
    String name;

    public Child(int x , String name) {
        super(20 , "Anish Gupta");
        this.x=x;
        this.name=name;
    }

    void show(){
        System.out.println("Super data");
        super.show();
        System.out.println("Child data ");
        System.out.println("X : "+x);
        System.out.println("Name : "+name);
    }    
}

public class Q16 {
    public static void main(String[] args) {
        Child c= new Child(1, "Lado");
        c.show();
    }
}
