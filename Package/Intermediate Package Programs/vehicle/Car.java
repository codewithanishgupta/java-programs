package vehicle;

public class Car {
    private String model;
    private String company;
    private double price;

    public Car(String model, String company, double price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void showCar() {
        System.out.println("===== Car Details =====");
        System.out.println("Model : " + model);
        System.out.println("Company : " + company);
        System.out.println("Price : " + price);
    }
}