// 7. Create classes:Person,Employee,Manager Display details from all levels.

class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;

    void displayEmployee() {
        displayPerson();
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

public class Q7 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Anish";
        m.age = 25;
        m.empId = 301;
        m.department = "Finance";

        m.displayManager();
    }
}
