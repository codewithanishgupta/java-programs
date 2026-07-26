package salary;

import employee.Employee;

public class Salary {
    private Employee emp;

    public Salary(Employee emp) {
        this.emp = emp;
    }

    public double calculateSalary() {
        double hra = 0.2 * emp.getBasicPay();   // House Rent Allowance
        double da = 0.1 * emp.getBasicPay();    // Dearness Allowance
        double gross = emp.getBasicPay() + hra + da;
        return gross;
    }

    public void displaySalary() {
        System.out.println("Total Salary of " + emp.getName() + ": " + calculateSalary());
    }
}
