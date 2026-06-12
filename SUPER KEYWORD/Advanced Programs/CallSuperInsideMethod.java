// 18.Write a Java program to use super to call parent class method inside 
// overridden method.


class Parent {
    void show(){
        System.out.println("Parent class method.....");
    }

}

class Child extends Parent{
    @Override
    void show(){
        System.err.println("Child class Method....");
        super.show();
    }
}


public class CallSuperInsideMethod {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
    }
}
