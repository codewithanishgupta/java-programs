// 18.Create a Vehicle class where speed cannot exceed 180 km/h. 

class Vehicle {
    private String model;
    private int speed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        if(speed <= 180 && speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid Speed! Must be between 0 and 180 km/h.");
        }
    }

    public void showDetails() {
        System.out.println("Vehicle Model: " + model + ", Speed: " + speed + " km/h");
    }
}


public class Q18 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setModel("Tata-URS0026");
        v.setSpeed(120);
        v.showDetails();

        // v.setSpeed(190);    speed must be >=0 && <=180
    }
}
