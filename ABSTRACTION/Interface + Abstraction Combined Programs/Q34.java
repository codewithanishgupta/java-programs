// 34.Write a Java program to create a smart home system using abstraction.

interface Controllable {
    void turnOn();
    void turnOff();
}

abstract class SmartHome implements Controllable {
    String deviceName;

    public SmartHome(String deviceName) {
        this.deviceName = deviceName;
    }
    
    abstract void deviceInfo ();

    void showStatus(String status) {
        System.out.println(deviceName + " is " + status);
    }
}

class Light extends SmartHome {

    public Light(String deviceName) {
        super(deviceName);
    }
    @Override
    void deviceInfo(){
        System.out.println("Device : Smart Light ");
    }
    @Override
    public void turnOn(){
        showStatus("Glowing");
    }
    @Override
    public void turnOff() {
        showStatus("Switched Off");
    }
} 

class Fan extends SmartHome {

    public Fan(String deviceName) {
        super(deviceName);
    }
    @Override
    void deviceInfo() {
        System.out.println("Device : Smart Fan");
    }
    @Override
    public void turnOn() {
        showStatus("Spinning");
    }
    @Override
    public void turnOff () {
        showStatus("Stopped");
    }
}
class AirConditioner extends SmartHome {
    public AirConditioner(String deviceName) {
        super(deviceName);
    }

    @Override
    void deviceInfo () {
        System.out.println("Device: Smart AC");
    }

    @Override
    public void turnOn() {
        showStatus("cooling the room");
    }

    @Override
    public void turnOff() {
        showStatus("switched off");
    }
}
public class Q34 {
    public static void main(String[] args) {
        SmartHome light = new Light("Philips Light");
        SmartHome fan = new Fan("Usha Fan");
        SmartHome ac = new AirConditioner("Samsung AC");

        light.deviceInfo();
        light.turnOn();

        fan.deviceInfo();
        fan.turnOn();

        ac.deviceInfo();
        ac.turnOn();

        System.out.println("----- Turning Off Devices -----");

        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }
}
