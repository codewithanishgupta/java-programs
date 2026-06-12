// 7.Write a Java program to pass parameters to parent constructor using super().


class A{
    int a;
    int b;

    public A(int a,int b) {
        this.a=a;
        this.b=b;
    }

}
class B extends A{
    
    B(){
       super(10, 20);
    }
         void show(){
        System.out.println("A : "+super.a+"  B : "+super.b);
    }
}


public class PassParameterUsingSuper {
    public static void main(String[] args) {
        B obj= new B();
        obj.show();
    }
    
}
