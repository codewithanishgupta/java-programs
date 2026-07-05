// 28.Smart Home Automation using interfaces. 

interface Device {
    void turnOn();
    void turnOff();
}

class Light implements Device {
    @Override
    public void turnOn(){
        System.out.println("Light is on ...");
    }
    @Override
    public void turnOff(){
        System.out.println("Light is off ...");
    }
}

class Fan implements Device {
    @Override
    public void turnOn () {
        System.out.println("Fan is spinning ...");
    }
    @Override
    public void turnOff () {
        System.out.println("Fan is stopped ...");
    }
}

class AC implements Device {
    @Override
    public void turnOn () {
        System.out.println("Air conditioner is cooling ...");
    }
    @Override
    public void turnOff () {
        System.out.println("Air conditioner is off ...");
    }
}

public class Q28 {
    public static void main(String[] args) {
        Device d ;

        d = new Light();
        d.turnOn();
        d.turnOff();
        System.out.println("-----------------------------------------------------");
        d = new Fan();
        d.turnOn();
        d.turnOff();
        System.out.println("-----------------------------------------------------");
        d = new AC();
        d.turnOn();
        d.turnOff();
    }
}
