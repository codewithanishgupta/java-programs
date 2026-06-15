// 13.Write a Java program to create an interface Calculator with methods for addition and subtraction.


interface Calculator{
    int addition(int x , int y);
    int subtraction(int x, int y);
}
class Solution implements Calculator {
    @Override
    public int addition(int x, int y){
        return (x+y);
    }
    @Override
    public int subtraction(int x , int y){
        return (x-y);
    }
    
}
public class Q13 {
    public static void main(String[] args) {
        Calculator c = new Solution();
        System.out.println("Addition : "+c.addition(2, 4));
        
        System.out.println("Subtraction : "+c.subtraction(50, 43));
        
    }
}
