// ·  Create a Mobile class with private brand and price.


import java.util.Scanner;

class Mobile {
    private String brand;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
}

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile m = new Mobile();

        System.out.print("Enter Mobile Brand : ");
        m.setBrand(sc.nextLine());

        System.out.print("Enter Mobile Price : ");
        m.setPrice(sc.nextDouble());

        System.out.println("====== Mobile Details ======");
        System.out.println("Brand : " + m.getBrand());
        System.out.println("Price : " + m.getPrice());
    }
}
