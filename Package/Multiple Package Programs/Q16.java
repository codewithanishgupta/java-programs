// 16.Create two packages: animals , birds Import both into the main class.

import animal.Animal;
import birds.Birds;

public class Q16 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Birds b = new Birds();

        a.show();
        b.show();
    }
}