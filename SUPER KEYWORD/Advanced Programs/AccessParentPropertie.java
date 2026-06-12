// 19.  Write a Java program to access parent class properties when names are 
//      same in child class.

class Parent{
    //properties..
    int a=20;
    String name="Anish gupta..";

}

class Child extends Parent{
    int a;
    String name;
    void show(){
        a=super.a;
        name=super.name;
        System.out.println("A : "+a+"   Name : "+name);
    }
}

public class AccessParentPropertie {
    public static void main(String[] args) {
        Child Ch= new Child();
        Ch.show();
    }
}
