// 5. Create a Car class with private model and year. 


import java.util.Scanner;

class Car {
    private String model;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
}

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();

        System.out.print("Enter Car Model : ");
        c.setModel(sc.nextLine());

        System.out.print("Enter Car Year : ");
        c.setYear(sc.nextInt());

        System.out.println("====== Car Details ======");
        System.out.println("Model : " + c.getModel());
        System.out.println("Year : " + c.getYear());
    }
}
