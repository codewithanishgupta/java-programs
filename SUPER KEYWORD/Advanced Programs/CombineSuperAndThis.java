// 16.Write a Java program to combine this() and super() in constructor.

class Parent{

    public Parent() {

        System.out.println("Parent constructer....");
    }
    
    
}

class Child extends Parent{
    
    public Child() {    
        
        this(20);
        
        System.out.println("Child constructer...");
        
    }
    public Child (int x){
        super();
        System.out.println("value of x : "+x);
    }
    
}


public class CombineSuperAndThis {
    public static void main(String[] args) {
        Child ch = new Child();
    }
}
