// 3.Write a Java program to create multiple objects of a class and display their values.


class A{
    int x,y;
    public void input(int a,int b){
        x=a;    y=b;
    }
    void show(){
        System.out.println("Data is X : "+x+"    Y : "+y);
    }
}
public class MultipleObject {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.input(10, 20);
        A obj2=new A();
        obj2.input(100, 200);
        A obj3=new A();
        obj3.input(1000, 2000);
        System.out.println("First object ......");
        obj1.show();
        System.out.println("Second object ......");
        obj2.show();
        System.out.println("Third object ......");
        obj3.show();
    }
}
