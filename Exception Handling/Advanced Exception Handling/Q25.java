// 25.Write a Java program to validate email addresses using exception handling.

class InvalidEmailException extends Exception {

    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidator {
    static void validateEmail(String email) throws InvalidEmailException {
        if (email != null && email.contains("@") && email.contains(".")) {
            System.out.println("Email is valid : " + email);
        } else {
            throw new InvalidEmailException("Invalid Email : " + email);
        }
    }
}

public class Q25 {
    public static void main(String[] args) {

        try {
            EmailValidator.validateEmail("anishprabhakar84gmail.com"); // messing '@'
        } catch (InvalidEmailException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        try {
            EmailValidator.validateEmail("anishprabhakar84@gmail"); // messing '.'
        } catch (InvalidEmailException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        try {
            EmailValidator.validateEmail("anishprabhakar84gmail"); // messing '@' & '.'
        } catch (InvalidEmailException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        try {
            EmailValidator.validateEmail("anishprabhakar84@gmail.com"); // curect email
        } catch (InvalidEmailException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

    }
}
