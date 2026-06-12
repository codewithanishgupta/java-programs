// 11.Write a Java program to access hidden parent variable using super.

class Parent {
    private int x=10;

    public Parent() {
        System.out.println("Hidden Parent variable is : "+x);
    }
    
}

class Child extends Parent{

}


public class HiddenParent {
    public static void main(String[] args) {
        Child obj=new Child();
    }
}
