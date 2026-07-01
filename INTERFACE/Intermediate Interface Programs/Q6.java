// 6.Create an interface Calculator with methods add(), subtract(), multiply(), and divide(). Implement it in a class SimpleCalculator. 

interface Calculator {
    double add(double x , double y);
    double subtract(double x , double y);
    double multiply (double x , double y);
    double divide (double x , double y);  
}

class Simplecalculator implements Calculator {
    @Override
    public double add(double a , double b){
        return (a+b);
    }
    @Override
    public double subtract(double a , double b){
        return (a-b);
    }
    @Override
    public double multiply(double a , double b){
        return (a*b);
    }
    @Override
    public double divide(double a , double b){
        return (a/b);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Calculator c = new Simplecalculator();
        System.out.println("Add : "+c.add(34, 56));
        System.out.println("Subtract : "+c.subtract(32, 34));
        System.out.println("Multiply : "+c.multiply(5, 6));
        System.out.println("Divide : "+c.divide(98, 4));
    }
}
