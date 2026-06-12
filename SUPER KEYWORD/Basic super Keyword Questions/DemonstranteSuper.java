// 3.Write a Java program to demonstrate super keyword in single inheritance.

class Parent{
    int a=34;
    String str="codewithanishgupta";

    void show(){
        System.out.println("Parent method call..");
    }
}

class Child extends Parent{
    int a=7;
    void display(){
    
        System.out.println(a+"  PArent variables : "+super.str+"  "+super.a);
        super.show();
    }
}

public class DemonstranteSuper {
    public static void main(String[] args) {
        Child C = new Child();
        C.display();
    }
}
