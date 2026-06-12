// 4.Write a Java program to show difference between this and super keyword.

class Parent{
    int a=10;
    int b=20;
    void show(int a, int b){
        System.out.print("Normally in method : ");
        System.out.println("A : "+a+"   B : "+b);


        System.out.print(" This Keyword use : ");
        System.out.println("A : "+this.a+"      B : "+this.b);
    }
}

class Child extends Parent{
    int a=30;
    int b=40;
    void display(){
        System.out.println("Use This A : "+this.a+"  B : "+this.b);
        System.out.println("Use super A : "+super.a+"   B : "+super.b);
    }
}

public class DifferenceThisSuper {
    public static void main(String[] args) {
        Child C = new Child();
        System.out.println("Parent method call...");
        C.show(50, 60);

        System.out.println("Child method call....");
        C.display();
    }
}
