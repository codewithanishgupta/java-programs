// 8.Create an interface RemoteControl with methods powerOn() and powerOff(). Implement it in classes TV and AC. 

interface RemoteControl {
    void powerOn();
    void powerOff();
}

class TV implements RemoteControl {
    @Override
    public  void powerOn () {
        System.out.println("Press ON button TV On");
    }
    @Override
    public void powerOff() {
        System.out.println("Press OFF button TV Off");
    }
}

class AC implements RemoteControl {
    @Override
    public void powerOn () {
        System.out.println("Press Switch Ac on...");
    }
     @Override
    public void powerOff() {
        System.out.println("Press Switch AC Off");
    }
}

public class Q8 {
    public static void main(String[] args) {
        RemoteControl Tv = new TV();
        RemoteControl Ac = new AC();

        Tv.powerOn();
        Tv.powerOff();

        Ac.powerOn();
        Ac.powerOff();
    }
}
