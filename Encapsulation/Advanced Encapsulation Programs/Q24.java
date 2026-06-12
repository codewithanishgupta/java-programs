// 24. Create an Employee Payroll System using encapsulation

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private double hra;   // House Rent Allowance
    private double da;    // Dearness Allowance
    private double deductions;

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        if(basicSalary > 0) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    public void setAllowances(double hra, double da) {
        this.hra = hra;
        this.da = da;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // Payroll calculation
    public double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - deductions;
    }

    // Display details
    public void showDetails() {
        System.out.println("===== Employee Payroll Details =====");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Deductions  : " + deductions);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary  : " + calculateNetSalary());
    }
}

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Employee ID: ");
        e.setId(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter Basic Salary: ");
        e.setBasicSalary(sc.nextDouble());

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();
        e.setAllowances(hra, da);

        System.out.print("Enter Deductions: ");
        e.setDeductions(sc.nextDouble());

        e.showDetails();
    }
}

