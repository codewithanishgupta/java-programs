// 35.Online Shopping Billing System with exception handling.

class BillingException extends Exception {

    public BillingException(String message) {
        super(message);
    }

}

class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) throws BillingException {
        if (price <= 0) {
            throw new BillingException("Invalid price for product : " + name);
        }
        if (quantity <= 0) {
            throw new BillingException("Invalid quantity for product : " + name);
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

}

class ShoppingCart {
    private double totalBill = 0;

    public void addProduct(Product p) {
        totalBill += p.getTotal();
        System.out.println("Added : " + p.getName() + " | Subtotal : " + totalBill);
    }

    public void checkout(double payment) throws BillingException {
        if (payment < totalBill) {
            throw new BillingException("Payment insufficient , Required : " + totalBill + " , Paid : " + payment);
        } else {
            System.out.println("Checkout successfull , Total Bill : " + totalBill + " | Paid : " + payment
                    + " | Change :" + (payment - totalBill));
        }
    }
}

public class Q35 {
    public static void main(String[] args) {
        System.out.println("================ Online Shopping Billing System ================");

        ShoppingCart cart = new ShoppingCart();

        try {
            Product p1 = new Product("Laptop", 76999, 2);
            Product p2 = new Product("HeadPhone", 999, 3);

            cart.addProduct(p1);
            cart.addProduct(p2);

            Product p3 = new Product("Mouse", -499, 3);
            cart.addProduct(p3);

        } catch (BillingException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        try {
            cart.checkout(51000);
        } catch (BillingException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            cart.checkout(157000);
        } catch (BillingException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
