// 17.Create a User class where password must contain at least 8 characters. 

class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must contain at least 8 characters!");
        }
    }

    public void showDetails() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

public class Q17 {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("Anish Gupta.");
        u.setPassword("lado@007");
        u.showDetails();
        u.setPassword("1asd");  // wrong  Password must be >= 8
        u.showDetails();
    }
}
