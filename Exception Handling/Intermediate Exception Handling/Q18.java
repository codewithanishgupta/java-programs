// 18.Write a Java program to validate marks. Throw an exception if marks are not between 0 and 100.

class InvalidMarkException extends Exception {

    public InvalidMarkException(String message) {
        super(message);
    }
}

public class Q18 {
    static void checkMarks(int marks) throws InvalidMarkException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Marks must be grater than one and smaller than and equal to 100 .");
        } else {
            System.out.println("Marks is : " + marks);
        }
    }

    public static void main(String[] args) {
        try {
            checkMarks(123);
        } catch (InvalidMarkException e) {
            System.out.println("Exception handled : " + e);
        }
        System.out.println("Programe continues after handled exception..");
    }
}