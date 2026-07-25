package vehicle;

public class Bike {
    private String model;
    private String company;
    private double price;

    public Bike(String model, String company, double price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void showBike() {
        System.out.println("===== Bike Details =====");
        System.out.println("Model : " + model);
        System.out.println("Company : " + company);
        System.out.println("Price : " + price);
    }
}