// 12.Write a Java program to pass object to another method using this.

class Demo{

    int x=20;
    String name;

    public Demo(int x, String name) {
        this.x=x;
        this.name= name;

    }
    void display(Demo D){
        System.out.println("X : "+D.x);
        System.out.println("Name : "+D.name);
    }

    void show(){
        display(this);
    }
    

}


public class Q12 {
    public static void main(String[] args) {
        Demo d= new Demo(29, "Anish gupta");
        d.show();
    }
}
