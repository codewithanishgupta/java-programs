// 14. Create a package arrayoperation containing methods:Find Maximum,Find Minimum,Sum of Array 

import arrayoperation.ArrayOperation;

public class Q14 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();

        int[] numbers = {12, 45, 7, 89, 23};

        System.out.println("Maximum = " + ao.findMax(numbers));
        System.out.println("Minimum = " + ao.findMin(numbers));
        System.out.println("Sum = " + ao.sumArray(numbers));
    }
}