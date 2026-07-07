// 18.Create a class Employee with method work(). Override it in Manager.

class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager managing the team...");
    }
}

public class Q18 {
    public static void main(String[] args) {
        Employee e;
        e = new Employee();
        e.work();

        e = new Manager();
        e.work();
    }
}
