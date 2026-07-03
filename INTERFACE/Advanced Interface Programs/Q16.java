

interface Constant {
    int value = 100;
}

class Demo implements Constant {
    void display(){
        System.out.println("Constant Value is : "+value);
    }
}

public class Q16 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}