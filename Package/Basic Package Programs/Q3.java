// 3. Create a package employee with a class Employee. Import the package into another program 
// and display employee information.

import employee.Employee;

public class Q3 {
    public static void main(String[] args) {
        Employee e = new Employee("Anish gupta", 6, 67000);
        e.display();
    }
}
