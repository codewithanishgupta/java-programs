// 28.Write a Java program to use this keyword in nested method calls.

// class Example{
//     void display(){
//         System.out.println("Hellow... Guys... Kya haal chal.");
//     }
//     void show(){
//         this.display();
//     }
// }

// public class Q28 {
//     public static void main(String[] args) {
//         Example e = new Example();
//         e.show();
//     }
// }

class Calculator {
    int result;

    // Method 1: add numbers
    void add(int num) {
        result += num;
        System.out.println("After add: " + result);
        this.multiply(2);   // Nested call using this
    }

    // Method 2: multiply numbers
    void multiply(int num) {
        result *= num;
        System.out.println("After multiply: " + result);
        this.subtract(3);   // Nested call using this
    }

    // Method 3: subtract numbers
    void subtract(int num) {
        result -= num;
        System.out.println("After subtract: " + result);
    }

    // Display final result
    void display() {
        System.out.println("Final Result = " + result);
    }
}

public class Q28 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5);       // Starts chain of nested calls
        c.display();
    }
}

