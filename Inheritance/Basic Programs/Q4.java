// 4. Create a class Employee with method displayEmployee(). Derive a class Manager and add manager details.

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

public class Q4 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Anish";
        m.empId = 229;
        m.department = "IT";

        m.displayManager();
    }
}
