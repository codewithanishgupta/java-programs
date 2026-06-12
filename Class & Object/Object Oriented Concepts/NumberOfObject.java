// 20. Write a Java program to count number of objects created using static variable.

class Demo{
    static int count=0;
    Demo(){
        count++;
    }
    static void show(){
        System.out.println("total object created : "+i);
    }
}


public class NumberOfObject {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        Demo d4=new Demo();
        Demo.show();
    }
}
