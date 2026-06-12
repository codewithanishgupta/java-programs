// 19.Write a Java program to use this keyword to call current class method.

class Demo {
    int x=10;
    String name;

    public Demo(int x, String name) {
        this.x=x;
        this.name=name;

    }
    void show(){
        System.out.println("x="+x);
        System.out.println("Name="+name);
    }
    void display(){
        System.out.println("Show mwthod call using this keyword");
        this.show();
    }
}


public class Q19 {
    public static void main(String[] args) {
        Demo d= new Demo(9, "Simmu jha");
        d.display();
    }
}
