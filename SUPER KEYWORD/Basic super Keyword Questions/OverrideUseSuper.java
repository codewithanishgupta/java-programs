// 5.Write a Java program where child class overrides method and calls parent method 
// using super.

class A{
    void show(){
        System.out.println("Parent class method......");
    }
}

class B extends A{
    @Override
    void show(){
        System.out.println("Child class method...");
        super.show();
    }
}


public class OverrideUseSuper {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
