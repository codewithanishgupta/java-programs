// 12.Create an Employee class where salary cannot be negative. 

import java.util.Scanner;

class Employee{
    private double salary;
    private String name;

    void setName(String name){
        this.name= name;
    }
    void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid Salary ! Must be positive.....");
        }
    }

    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }


}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee E = new Employee();
        System.out.print("Enter the Employee Name : ");
        E.setName(sc.nextLine());
        System.out.print("Enter the Employee Salary : ");
        E.setSalary(sc.nextDouble());

        System.out.println("________ Employee Details __________");
        System.out.println("Name : "+E.getName());
        System.out.println("Salary : "+E.getSalary());
    }
}
