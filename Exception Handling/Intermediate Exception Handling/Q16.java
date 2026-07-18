// 16.Write a Java program to validate age. Throw an exception if the age is less than 18.

public class Q16 {

    static void checkAge (int age) throws Exception {
        if(age < 18)
            throw new Exception("Age is less than 18.");
        else
            System.out.println("Age is valid.");
    }
    public static void main(String[] args) {
        try{
            checkAge(14);
        }catch (Exception e){
            System.out.println("Exception Handled : "+e);
        }

        System.out.println("Programe continues after handle exception...");
    }
}