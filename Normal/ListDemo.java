
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();
        l.add(23);
        l.add(45);
        l.add("Anish gupta");
        l.add(78236.983478);
        System.out.println("First "+l.get(0));
        System.out.println("2nd "+l.get(1));
        System.out.println("3nd "+l.get(2));
        System.out.println("Element in list : "+l);
    }
}
