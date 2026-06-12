// 7. Write a Java program to demonstrate parameterized constructor.

public class parameteriseCons {
    int x,y;

    parameteriseCons(int a,int b) {
        x= a;
        y=b;
        System.out.println("Parameterise constructor call \n Data is X = "+x+"  Y = "+y);
    }
    public static void main(String[] args) {
        parameteriseCons obj= new parameteriseCons(10, 30);
    }
}
