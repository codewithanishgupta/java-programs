// 30 Write a Java program to show limitations of super keyword.


class First{
    int x=20;
    int y=40;
    public First() {
        System.out.println("First class constructer.");
    }
    void sum(){
        System.out.println("Sum of number is : "+(x+y));
    }
}

class Second extends First{

    // super();  super not call out side the constructer. like
    public Second() {
        super();

        // super() shoud be call first element of constructer.
        // this is not like this.
        /*
            Second(){
                void sum();
                super();            this is worng.
            }
        */
    }
    
    // super.sum();     super method not call class body . it must be inside the method.
    //like

    void show(){
        super.sum();
    }


}

public class LimitationOfSuper {
    public static void main(String[] args) {
        Second S = new Second();
        S.show();
    }
}
