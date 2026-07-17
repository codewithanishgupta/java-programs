// 15.Write a Java program to create a custom exception.

class InvalidException extends Exception {

    public InvalidException(String message) {
        super(message);
    }

}

public class Q15 {
    static void divide(int n, int d) throws InvalidException {
        if (d == 0)
            throw new InvalidException("Denomenator can not be zero. ");
        else {
            int result = n / d;
            System.out.println("Result is " + result);
        }
    }

    public static void main(String[] args) {
        try {
            divide(23, 0);
        } catch (InvalidException e) {
            System.out.println("Exceptions Handled : " + e);
        }

        System.out.println("Programe continues after exception handled...");
    }
}
