package mathoperation;

public class MathOperation {

    public int square(int num) {
        return num * num;
    }

    public int cube(int num) {
        return num * num * num;
    }

    public long factorial(int num) {
        long fact = 1;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
