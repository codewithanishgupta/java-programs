// 16.Create a Product class where price must be positive. 

class Product {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price! Must be positive.");
        }
    }

    public void showDetails() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Q16{
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Jhumka");
        p.setPrice(250);
        p.showDetails();
        p.setPrice(-200);   // worng product price must be positive.
        p.showDetails();
    }
}