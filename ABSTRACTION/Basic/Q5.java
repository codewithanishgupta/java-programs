// 5.Write a Java program to create an abstract class Employee with an abstract method         calculateSalary().

abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
    }
}

class FullTimeEmployee extends Employee {
    double basicPay, hra, da;

    public FullTimeEmployee(String name, int id, double basicPay, double hra, double da) {
        super(name, id);
        this.basicPay = basicPay;
        this.hra = hra;
        this.da = da;
    }

    @Override
    double calculateSalary() {
        return basicPay + hra + da;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    public PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Anish Gupta", 101, 20000, 5000, 3000);
        e1.display();
        System.out.println("Salary : " + e1.calculateSalary());

        System.out.println("---------------------------");

        Employee e2 = new PartTimeEmployee("Lado", 102, 40, 200);
        e2.display();
        System.out.println("Salary : " + e2.calculateSalary());
    }
}

