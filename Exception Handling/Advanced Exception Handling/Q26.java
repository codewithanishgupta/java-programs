// 26.Write a Java program that demonstrates exception propagation.

public class Q26 {

    static void method1() throws ArithmeticException {
        int result = 9 / 0;
        System.out.println("Result : " + result);
    }

    static void method2() throws ArithmeticException {
        method1();
    }

    static void method3() throws ArithmeticException {
        method2();
    }

    public static void main(String[] args) {
        try {
            method3();
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        System.out.println("Programe continue after ");
    }
}