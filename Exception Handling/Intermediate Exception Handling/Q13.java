// 13.Write a Java program that throws an exception using the throw keyword.



public class Q13 {
    public static void main(String[] args) {
        try {
            checkAge(13);
        } catch (Exception e) {
            System.out.println("Exception caught : "+e.getMessage());
        }
        System.out.println("Programe continues after exception handled...");
    }
    static void checkAge(int age) throws  Exception{
        if (age<18){
            throw new Exception("Age must be grater and equal 18 .");
        }else{
            System.out.println("Eligible for vote .");
        }
    }
}