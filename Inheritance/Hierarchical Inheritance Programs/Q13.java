// 13.Create a base class Employee and derive:,Teacher,Accountant,Clerk Display employee information.

class Employee {
    String name;
    int empId;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Teacher extends Employee {
    String subject;

    void displayTeacher() {
        displayEmployee();
        System.out.println("Subject: " + subject);
        System.out.println("---------------------------------------------------");
    }
}

class Accountant extends Employee {
    String specialization;

    void displayAccountant() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------------------------------");
    }
}

class Clerk extends Employee {
    String section;

    void displayClerk() {
        displayEmployee();
        System.out.println("Section: " + section);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Anish";
        t.empId = 229;
        t.subject = "Computer Science";
        t.displayTeacher();

        Accountant a = new Accountant();
        a.name = "Lado";
        a.empId = 230;
        a.specialization = "Finance";
        a.displayAccountant();

        Clerk c = new Clerk();
        c.name = "Simmu";
        c.empId = 239;
        c.section = "Computer Aptitude";
        c.displayClerk();
    }
}
