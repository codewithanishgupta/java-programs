// 15.Write a Java program to create an interface RemoteControl and implement it in TV.

interface RemoteControl {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

class TV implements RemoteControl {
    String brand;
    int currentChannel;

    public TV(String brand) {
        this.brand = brand;
        this.currentChannel = 1;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " TV is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " TV is now OFF.");
    }

    @Override
    public void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println(brand + " TV changed to channel " + currentChannel);
    }
}

public class Q15 {
    public static void main(String[] args) {
        RemoteControl rc = new TV("Samsung");

        rc.powerOn();
        rc.changeChannel(5);
        rc.changeChannel(10);
        rc.powerOff();
    }
}
