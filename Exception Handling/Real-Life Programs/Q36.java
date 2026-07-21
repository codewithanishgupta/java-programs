// 36. Employee Salary Calculator with input validation.

class SalaryException extends Exception {
    public SalaryException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) throws SalaryException {
        if (baseSalary <= 0) {
            throw new SalaryException("Invalid base salary for employee: " + name);
        }
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(double bonus, double deductions) throws SalaryException {
        if (bonus < 0) {
            throw new SalaryException("Bonus cannot be negative.");
        }
        if (deductions < 0) {
            throw new SalaryException("Deductions cannot be negative.");
        }
        if (deductions > (baseSalary + bonus)) {
            throw new SalaryException("Deductions exceed total earnings.");
        }

        return baseSalary + bonus - deductions;
    }

    public String getName() {
        return name;
    }
}

public class Q36 {
    public static void main(String[] args) {
        System.out.println("--------- Employee Salary Calculator ----------");

        try {
            Employee emp = new Employee("Anish", 30000);

            double netSalary1 = emp.calculateSalary(5000, 2000);
            System.out.println("Net Salary of " + emp.getName() + ": " + netSalary1);

            double netSalary2 = emp.calculateSalary(-1000, 2000);
            System.out.println("Net Salary: " + netSalary2);

        } catch (SalaryException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            Employee emp2 = new Employee("Ravi", -25000); 
        } catch (SalaryException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}