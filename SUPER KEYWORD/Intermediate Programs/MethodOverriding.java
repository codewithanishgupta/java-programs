// 12.Write a Java program to resolve method overriding using super.


class A{
    void show(){
        System.out.println("Parent class method....");
    }
}


class B extends A{
    @Override
    void show(){
        System.out.println("Child class method...");
    }

    void display(){
        show();
        super.show();
    }

}
public class MethodOverriding {
   public static void main(String[] args) {
     B obj=new B();
     obj.display();
   }
}
