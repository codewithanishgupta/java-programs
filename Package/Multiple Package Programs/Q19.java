// 19.Create two packages: employee,salary Calculate salary using classes from both packages.

import employee.Employee;
import salary.Salary;

public class Q19 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anish", 201, 30000);
        e1.display();

        Salary s1 = new Salary(e1);
        s1.displaySalary();
    }
}
