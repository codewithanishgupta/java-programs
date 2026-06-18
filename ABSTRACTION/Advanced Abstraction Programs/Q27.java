// 27.Write a Java program to create an abstract class Employee and calculate salaries for different employee types.

abstract class Employee {
    String name ;
    int id ;

    public Employee(String name , int id) {
        this.name = name;
        this.id = id ;
    }

    abstract double calculateSalary();

    void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Salary : "+calculateSalary());
        System.out.println("\n_----------------------------------_\n");
    }
}

class FullTimeEmployee extends Employee {
    double basicPay, hra, da;

    public FullTimeEmployee(String name , int id , double basicPay , double hra , double da) {
        super(name, id);
        this.basicPay = basicPay;
        this.hra = hra;
        this.da = da;
    }
    @Override
    double calculateSalary () {
        return (basicPay+hra+da);
    }
}

class PartTimeEmployee extends Employee {
    int workHours;
    int ratePerHours;

    public PartTimeEmployee(String name , int id , int workHours , int ratePerHours) {
        super(name, id);
        this.workHours = workHours;
        this.ratePerHours = ratePerHours;
    }
    @Override
    double calculateSalary () {
        return workHours*ratePerHours;
    }
}

public class Q27 {
    public static void main(String[] args) {
         Employee e1 = new FullTimeEmployee("Anish Gupta", 101, 20000, 5000, 3000);
        Employee e2 = new PartTimeEmployee("Lado", 102, 40, 200);
        
        e1.display();
        e2.display();
    }
}
