// 10.Create a program to calculate salary using multilevel inheritance.

class Employee {
    String name;
    int empId;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        displayEmployee(); 
        System.out.println("Department: " + department);
    }
}

class Salary extends Manager {
    double basicPay;
    double hra;
    double da;

    double calculateSalary() {
        return basicPay + hra + da;
    }

    void displaySalary() {
        displayManager();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Q10 {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.name = "Anish";
        s.empId = 229;
        s.department = "HR";
        s.basicPay = 35000;
        s.hra = 10000;
        s.da = 5000;

        s.displaySalary();
    }
}
