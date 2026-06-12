// 14.Write a Java program to use super in multilevel inheritance.


class A{
    public A() {
        System.out.println("Class A call.");
    }   
}

class B extends A{
    public B() {
         System.out.println("Class B call.");
    }   
}

class C extends B{
    public C() {
         System.out.println("Class C call.");
    }   
}

class D extends C{
    public D() {
         System.out.println("Class D call.");
    }   
}

public class MultiLevel {
    public static void main(String[] args) {
        D obj=new D();
    }
}
