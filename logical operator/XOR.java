// Write a Java program to demonstrate bitwise XOR (^) operator.

public class XOR {
    public static void main(String[] args) {
        int a = 12;  // Binary: 01100
        int b = 25;  // Binary: 11001
        int result = a ^ b;  // Binary: 01100 ^ 11001 = 10101 (21)
       /*   01100
            11001
        ..............
            10101 */ 
        System.out.println(a + " ^ " + b + " = " + result);
    }
}
