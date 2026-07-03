// 19.Create a functional interface and use a Lambda Expression. 

/* 
        interface MyInterface {
            void show();
        }

        public class Q19 {
            public static void main(String[] args) {
                MyInterface obj = () -> {
                    System.out.println("Hellow java");
                };
                obj.show();       
            }
        }
    */


// Functional interface → ek hi abstract method hota hai
@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class Q19 {
    public static void main(String[] args) {
        // Lambda Expression for addition
        Calculator add = (a, b) -> a + b;

        // Lambda Expression for multiplication
        Calculator multiply = (a, b) -> a * b;

        // Lambda Expression for subtraction
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + add.operation(10, 5));
        System.out.println("Multiplication: " + multiply.operation(10, 5));
        System.out.println("Subtraction: " + subtract.operation(10, 5));
    }
}
