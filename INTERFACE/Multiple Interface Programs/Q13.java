// 13.Create interfaces Father and Mother with different methods. Implement both in a class Child. 

interface Father {
    String name = "Anil Sah";
    void fatherWork ();
}

interface Mother {
    String name = "Munni Devi";
    void motherWork();
}

class Child implements Father , Mother {
    String name;

    public Child(String name ) {
        this.name = name;
    }
    @Override
    public void fatherWork (){
        System.out.println(name+" Learns discipline from Father");
    }
    @Override
    public void motherWork(){
        System.out.println(name+" Learns Care and Love From Mother");
    }
    void display (){
        System.out.println("Father name "+Father.name);
        System.out.println("Mother name "+Mother.name);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Child c = new Child("Anish");
        c.display();
        c.fatherWork();
        c.motherWork();
    }
}
