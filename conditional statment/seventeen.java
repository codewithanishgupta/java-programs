// Q17.Write a Java program to print the day of the week using switch.

import java.util.Scanner;

public class seventeen {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter Day in number (1-7): ");
        num = sc.nextInt();
        switch(num){
            case 1 :
                {
                    System.out.println("Monday ");
                    break ;
                }
                case 2 :
                {
                    System.out.println("Tuesday  ");
                    break ;
                }
                case 3 :
                {
                    System.out.println("Wednesday ");
                    break ;
                }
                case 4 :
                {
                    System.out.println("thursday ");
                    break ;
                }
                case 5 :
                {
                    System.out.println("Friday ");
                    break ;
                }
                 case 6 :
                {
                    System.out.println("Saturday ");
                    break ;
                }
                 case 7 :
                {
                    System.out.println("Sunday");
                    break ;
                }
                default :
                {
                    System.out.println("Invailid choice...");
                }
        }
        sc.close();
    }
    
}
