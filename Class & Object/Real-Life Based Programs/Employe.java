// 29. Write a Java program to create class EmployeeSalary to calculate salary with bonus.

import java.util.Scanner;

class EmployeeSalary{
    double salary,bonus,sal;
    int id;
    String name;

    public EmployeeSalary(String name,double salary,double bonus,int id) {
        this.salary=salary;
        this.bonus=bonus;
        this.name=name;
        this.id=id;
        this.sal=0;
    }
    void calculate(){
        sal=salary+bonus;
        
    }
    void display(){
        System.out.println("\n--------EMPLOYEE DETAILS-------\n");
        System.out.println("Employee name is        : "+name);
        System.out.println("Employee id  is         : "+id);
        System.out.println("Emloyee salary          : "+salary);
        System.out.println("Employee Bonus          : "+bonus);
        System.out.println("Employsee total salary  : "+sal);
    }
    
}

public class Employe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employe name : ");
        String name=sc.nextLine();
        System.out.print("Enter employee ID : ");
        int id = sc.nextInt();
        System.out.print("Enter employee salary : ");
        double salary=sc.nextDouble();
        System.out.print("Enter employee bonus : ");
        double bonus=sc.nextDouble();
        EmployeeSalary E=new EmployeeSalary(name,salary,bonus,id);
        E.calculate();
        E.display();
    }
}
