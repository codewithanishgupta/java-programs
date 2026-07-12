// 20.Create a class Hospital with method treatment(). Override it in:Dentist,Cardiologist,Orthopedic

abstract class Hospital {
    abstract void treatment();
}

class Dentist extends Hospital {
    @Override
    void treatment() {
        System.out.println("Dentist provides treatment for teeth and oral problems.");
    }
}

class Cardiologist extends Hospital {
    @Override
    void treatment() {
        System.out.println("Cardiologist provides treatment for heart-related issues.");
    }
}

class Orthopedic extends Hospital {
    @Override
    void treatment() {
        System.out.println("Orthopedic provides treatment for bones and joints.");
    }
}

public class Q20 {
    public static void main(String[] args) {
        Hospital h;

        h = new Dentist();
        h.treatment();

        h = new Cardiologist();
        h.treatment();

        h = new Orthopedic();
        h.treatment();
    }
}