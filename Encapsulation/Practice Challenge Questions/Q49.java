//49. Create a SmartPhone class with battery percentage validation. 

class SmartPhone {
    private String brand;
    private String model;
    private int battery; 
  
    public SmartPhone(String brand, String model, int battery) {
        this.brand = brand;
        this.model = model;
        setBattery(battery); 
    }

    public void setBattery(int battery) {
        if(battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            System.out.println("Invalid battery percentage! Setting to 0.");
            this.battery = 0;
        }
    }

    public int getBattery() {
        return battery;
    }

    public void charge(int amount) {
        if(amount > 0) {
            if(battery + amount <= 100) {
                battery += amount;
                System.out.println("Charged " + amount + "% successfully.");
            } else {
                battery = 100;
                System.out.println("Battery fully charged!");
            }
        } else {
            System.out.println("Invalid charge amount!");
        }
    }

    public void use(int amount) {
        if(amount > 0 && amount <= battery) {
            battery -= amount;
            System.out.println("Used " + amount + "% battery.");
        } else {
            System.out.println("Not enough battery or invalid usage!");
        }
    }

    public void showDetails() {
        System.out.println("===== SmartPhone Details =====");
        System.out.println("Brand   : " + brand);
        System.out.println("Model   : " + model);
        System.out.println("Battery : " + battery + "%");
    }
}

public class Q49 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Samsung", "Galaxy S24", 50);
        sp.showDetails();

        sp.charge(30);  
        sp.showDetails();

        sp.use(60);      
        sp.showDetails();

        sp.charge(80); 
        sp.showDetails();

        sp.setBattery(120); 
        sp.showDetails();
    }
}
