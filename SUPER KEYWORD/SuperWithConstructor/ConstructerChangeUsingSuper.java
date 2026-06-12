// 8.Write a Java program to demonstrate constructor chaining using super.


class Parent{
    int x=10;
    

    public Parent(int x) {
        
        System.out.println("X : "+x);
    }

    
}

class Child extends Parent{

    public Child(int x) {
        super(x);
            System.out.println("Child X : "+x);
            System.out.println("Parent X : "+super.x);
    }
    
}



public class ConstructerChangeUsingSuper {
    public static void main(String[] args) {
        Child ch=new Child(20);
    }
}
