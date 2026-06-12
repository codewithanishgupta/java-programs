// 2.·  Create an Employee class with private id and salary. 

import java.util.Scanner;

class Employee{
    private int id;
    private double salary;

    void setId(int id){
        this.id=id;
    }
    void setSalary(double salary){
        this.salary= salary;
    }

    int getId(){
        return id;
    }
    double getSalary(){
        return salary;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id : ");
        e.setId(sc.nextInt());
        System.out.print("Enter Employee Salary : ");
        e.setSalary(sc.nextDouble());

        System.out.println("-------- Employee Details ---------");
        System.out.println("Id : "+e.getId());
        System.out.println("Salary : "+e.getSalary());
    }
}
