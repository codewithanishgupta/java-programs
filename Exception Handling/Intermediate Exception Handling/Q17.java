// 17.Write a Java program to validate a password. Throw an exception if it is shorter than 8 characters.

class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }

}

public class Q17 {
    static void validPassword(String pass) throws InvalidPasswordException {
        if (pass.length() < 8)
            throw new InvalidPasswordException("Password at least 8 character");
        else
            System.out.println("Password is valid.");
    }

    public static void main(String[] args) {
        try {
            validPassword("Anish12");
        } catch (InvalidPasswordException e) {
            System.out.println("Exception Handled : " + e);
        }

        System.out.println("Programe continues after handle exception...");
    }
}
