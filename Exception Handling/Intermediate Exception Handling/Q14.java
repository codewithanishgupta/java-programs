// 14.Write a Java program that declares an exception using the throws keyword.

public class Q14 {
    static void divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0)
            throw new ArithmeticException("Denominator connot be zero.");
        else {
            int result = numerator / denominator;
            System.out.println("Result is : " + result);
        }
    }

    public static void main(String[] args) {
        try {
            divide(12, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled : " + e.getMessage());
        }
        System.out.println("programe execute after exception handled...");
    }
}
