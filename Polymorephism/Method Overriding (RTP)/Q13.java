// 13.Create a class Employee with method work(). Override it in:Manager ,Developer,Tester 

class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing the team and projects...");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is writing and debugging code...");
    }
}

class Tester extends Employee {
    @Override
    void work() {
        System.out.println("Tester is testing the application for bugs...");
    }
}

public class Q13 {
    public static void main(String[] args) {
        Employee e;

        e = new Manager();
        e.work();

        e = new Developer();
        e.work();

        e = new Tester();
        e.work();
    }
}