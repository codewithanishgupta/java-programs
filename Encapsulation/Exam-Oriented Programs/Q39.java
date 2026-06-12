// 39. Write a program to hide customer details in a shopping application. 

class Customer {

    private String name;
    private String email;
    private String address;
    private long phone;

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }


    public String getName() {
         return name; 
    }
    public String getEmail() {
         return email; 
    }
    public String getAddress() {
         return address; 
    }
    public long getPhone() {
         return phone; 
    }

    public void showCustomerDetails() {
        System.out.println("===== Customer Details =====");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        // phone and address intentionally hidden for privacy
        System.out.println("Status  : Customer details are protected!");
    }
}

class ShoppingApp {
    public void placeOrder(Customer c, String product) {
        System.out.println("\nOrder placed successfully!");
        System.out.println("Product : " + product);
        System.out.println("Customer : " + c.getName());
        // sensitive details not shown here
    }
}

public class Q39 {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setName("Anish Gupta");
        c.setEmail("anish@example.com");
        c.setAddress("Patna, Bihar");
        c.setPhone(9876543210L);

        c.showCustomerDetails();

        ShoppingApp app = new ShoppingApp();
        app.placeOrder(c, "Wireless Headphones");
    }
}
