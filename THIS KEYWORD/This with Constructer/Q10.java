// 10.Write a Java program to use this keyword in parameterized constructor.

class Demo{
    int age;
    String id;

    public Demo(int age, String id) {
        this.age=age;
        this.id=id;
    }
    void show(){
        System.out.println("Age : "+age);
        System.out.println("Insta id  : "+id);
    }
    
}

public class Q10 {
    public static void main(String[] args) {
        Demo D = new Demo(21, "anishprabhakar007");
        D.show();
    }
}
