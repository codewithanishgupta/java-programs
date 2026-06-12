// 8. Write a Java program to initialize object using constructor and display values.

public class InitializeUsingCons {
    int x,y;

    public InitializeUsingCons() {
        x=30;   y=70;
    }
    void display(){
        System.out.println(" Value of X : "+x+" Y : "+y);
    }
    public static void main(String[] args) {
        InitializeUsingCons obj=new InitializeUsingCons();
        obj.display();
    }
}
