// 2.Write a Java program to call parent class method using super keyword.

class Parent{
    int a=12;
    int b=21;

    int sum(){
        return a+b;
    }
}

class Child extends Parent{
    void result(){
        System.out.println("Sum is : "+super.sum());
    }
}


public class CallParentMethod {
    public static void main(String[] args) {
        Child C= new Child();
        C.result();
    }
}
