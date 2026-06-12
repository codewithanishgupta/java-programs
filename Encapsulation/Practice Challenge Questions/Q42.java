// 42. Create a FuelTank class where fuel cannot exceed tank capacity. 

class FuelTank {
    private double capacity;
    private double fuelLevel;

    public FuelTank(double capacity) {
        if(capacity>=0){
            this.capacity = capacity;
            this.fuelLevel=0;
        }else{
            System.out.println("Invalid capacity setting to 0");
            this.capacity=0;
        }
    }

    public void addFuel(double amount){
        if(amount>0){
            if(fuelLevel+amount <= capacity){
                fuelLevel+=amount;
                System.out.println("Added "+amount+ " liters of fuels");
            }else{
                System.out.println("Cannot add " + amount + " liters. Tank capacity exceeded!");
            }
        }else{
            System.out.println("Invalid fuel amount!");
        }
    }

    public void consumeFuel(double amount){
        if(amount>=0 && amount<= fuelLevel){
            fuelLevel -= amount;
             System.out.println("Consumed " + amount + " liters of fuel.");
        } else {
            System.out.println("Not enough fuel or invalid amount!");
        }
    }

    public void showStatus() {
        System.out.println("===== Fuel Tank Status =====");
        System.out.println("Capacity   : " + capacity + " liters");
        System.out.println("Fuel Level : " + fuelLevel + " liters");
    }

}

public class Q42 {
    public static void main(String[] args) {
        FuelTank tank = new FuelTank(50);

        tank.showStatus();

        tank.addFuel(30); 
        tank.showStatus();

        tank.addFuel(25);
        tank.showStatus();

        tank.consumeFuel(10); 
        tank.showStatus();

        tank.consumeFuel(40);
        tank.showStatus();
    }
}
