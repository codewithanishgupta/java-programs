// 19.Create a class Appliance with method switchOn(). Override it in:Fan,TV,AC 

// Interface for Appliance
interface Appliance {
    void switchOn();
}

// Fan implements Appliance
class Fan implements Appliance {
    @Override
    public void switchOn() {
        System.out.println("Fan is switched on and rotating...");
    }
}

// TV implements Appliance
class TV implements Appliance {
    @Override
    public void switchOn() {
        System.out.println("TV is switched on and displaying channels...");
    }
}

// AC implements Appliance
class AC implements Appliance {
    @Override
    public void switchOn() {
        System.out.println("AC is switched on and cooling the room...");
    }
}

public class Q19.ja {
    public static void main(String[] args) {
        Appliance a;

        a = new Fan();
        a.switchOn();

        a = new TV();
        a.switchOn();

        a = new AC();
        a.switchOn();
    }
}

