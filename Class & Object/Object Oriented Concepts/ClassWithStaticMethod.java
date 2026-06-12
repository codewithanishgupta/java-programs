
import java.util.Scanner;

// 17. Write a Java program to create a class with static variable and static method.

class Person{
    static String name;
    static int hight;
    static String color;
    
    static void setName(String naam){
        name= naam;
    }
    static void setColor(String colour){
        color=colour;
    }
    static void setHight(int ht){
        hight=ht;
    }

    static String getName(){
        return name;
    }
    static int gethHight(){
        return hight;
    }
    static String getColor(){
        return color;
    }
}


public class ClassWithStaticMethod {
    public static void main(String[] args) {
        String name ,color;
        int hight; 
        System.out.print("Enter the name of person : ");
        name=new Scanner(System.in).nextLine();
        System.out.print("Enter person colour : ");
        color=new Scanner(System.in).nextLine();
        System.out.print("Enter person height (in cm) : ");
        hight = new Scanner(System.in).nextInt();

        Person.setName(name);
        Person.setColor(color);
        Person.setHight(hight);
        System.out.println("Person name is : "+Person.getName());
        System.out.println("Person Colour is :" + Person.getColor());
        System.out.println("Person Hight is : "+Person.gethHight());
    }
}
