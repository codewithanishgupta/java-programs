// 10.Write a Java program where child class has no constructor 
// but parent constructor is called automatically.


class Parent{

    public Parent() {
        System.out.println("Parent constructer call....");
    }
    
}

class Child extends Parent{
    
} 




public class WithoutChildConsCallParentCons {
    public static void main(String[] args) {
        Child obj= new Child();
    }
}
