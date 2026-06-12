// 7.Write a Java program to search an element in an array (Linear Search).


import java.util.Scanner;
public class SearchingSeven {
    public static void main(String[] args) {
        int n,key,position=0;
        boolean find=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the how many elemment in an array : ");
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the number to find in an array : ");
        key=sc.nextInt();
        for(int c: arr){
            if(c==key){
                find=true;
                break;
            }
            position++;
        }
        if(find){
            System.out.println("Number is exits in an array at index "+position);
        }
        else{

            System.out.println("Number is not exits in an array....");
        }
        }
    } 
    
