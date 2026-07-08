// 31.Write a Java program to calculate employee salary using inheritance.

class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        System.out.println("Employee constructor executed...");
    }

    double calculateSalary() {
        return baseSalary;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
        System.out.println("Manager constructor executed...");
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Developer extends Employee {
    double overtimePay;

    public Developer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
        System.out.println("Developer constructor executed...");
    }

    @Override
    double calculateSalary() {
        return baseSalary + overtimePay;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Q31 {
    public static void main(String[] args) {
        Manager m = new Manager("Lado jii", 50000, 10000);
        m.showDetails();

        System.out.println("-------------------");

        Developer d = new Developer("Anish", 40000, 5000);
        d.showDetails();
    }
}