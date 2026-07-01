// 7.Create an interface Employee with method calculateSalary(). Implement it for FullTimeEmployee and PartTimeEmployee. 

interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    double Salary;
    public FullTimeEmployee(double Salary) {
        this.Salary = Salary;
    }
    @Override
    public double calculateSalary() {
        return Salary; 
    }
}

class PartTimeEmployee implements Employee {
    double hourRate;
    int hoursWorked;
    public PartTimeEmployee(double hourRate, int hoursWorked) {
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourRate * hoursWorked; 
    }
}

public class Q7 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(30000);
        Employee e2 = new PartTimeEmployee(500, 40);

        System.out.println("Full Time Employee Salary : " + e1.calculateSalary());
        System.out.println("Part Time Employee Salary : " + e2.calculateSalary());
    }
}

