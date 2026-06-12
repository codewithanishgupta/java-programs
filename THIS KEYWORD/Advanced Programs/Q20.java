// 20.Write a Java program to demonstrate multiple uses of this in one class.


class Demo{
    int x;
    String name;

    public Demo(int x ,String name) {
        this.x=x;
        this.name=name;
    }

    void dispaly(){
        System.out.println("X : "+this.x);
        System.out.println("Name : "+this.name);
    }

    void show(){
        this.dispaly();
    }

    void compare(Demo D) {
        if (this == D) {
            System.out.println("Both refer to the same object.");
        } else {
            System.out.println("Different objects.");
        }
    }

    Demo updateName(String newName) {
        this.name = newName;
        return this;
    }
}

public class Q20 {
    public static void main(String[] args) {
        Demo d1= new Demo(29, "Anish Gupta");
        Demo d2 = new Demo(9, "Simran jha");
        d1.show();
        d2.show();
        d1.compare(d2);
        d2.updateName("Simmu");
        d2.show();
    }
}
