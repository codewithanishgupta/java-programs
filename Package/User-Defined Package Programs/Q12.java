// 12.Create a package mathoperation containing methods: Square,Cube,Factorial 

import mathoperation.MathOperation;

public class Q12 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();

        int n1 = 5;
        int n2 = 7;

        System.out.println("Square of " + n1 + " = " + mo.square(n1));
        System.out.println("Cube of " + n1 + " = " + mo.cube(n2));
        System.out.println("Factorial of " + n2 + " = " + mo.factorial(n1));
    }
}

