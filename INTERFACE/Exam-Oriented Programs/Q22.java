// 22.Write a Java program to demonstrate multiple inheritance using interfaces. 


interface Father {
    void fatherWork();
}

interface Mother {
    void motherWork();
}

class Child implements Father, Mother {
    String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void fatherWork() {
        System.out.println(name + " learns discipline from Father.");
    }

    @Override
    public void motherWork() {
        System.out.println(name + " learns care and love from Mother.");
    }
}

public class Q22 {
    public static void main(String[] args) {
        Child c = new Child("Anish");
        c.fatherWork();
        c.motherWork();
    }
}
