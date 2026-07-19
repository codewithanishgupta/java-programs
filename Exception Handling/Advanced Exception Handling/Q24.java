// 24.Write a Java program to create an Online Login System using custom exceptions.

class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}

class OnlineLogin {
    private String username;
    private String password;

    public OnlineLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void login(String enteredUser, String enteredPass) throws LoginException {
        if (!enteredUser.equals(username)) {
            throw new LoginException("Invalid Username.");
        } else if (!enteredPass.equals(password)) {
            throw new LoginException("Invalid Password.");
        } else {
            System.out.println("Login successful! Welcome, " + username);
        }
    }
}

public class Q24 {
    public static void main(String[] args) {
        System.out.println("--------- Online Login System ----------");

        OnlineLogin account = new OnlineLogin("anish", "12345");

        try {
            account.login("anish", "wrongpass");   // wrong password
        } catch (LoginException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            account.login("wronguser", "12345");   // wrong username
        } catch (LoginException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            account.login("anish", "12345");       // correct credentials
        } catch (LoginException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
