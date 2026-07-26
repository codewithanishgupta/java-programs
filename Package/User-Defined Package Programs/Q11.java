// 11.Create your own package named utility containing a class that checks whether a number is even or odd.
import utility.NumberCheck;

public class Q11 {
    public static void main(String[] args) {
        NumberCheck nc = new NumberCheck();

        nc.checkEvenOdd(10);
        nc.checkEvenOdd(7);
        nc.checkEvenOdd(0);
    }
}