// 36. Write a program to validate salary using encapsulation. 


class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary >= 0) {   // validation
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! Salary cannot be negative.");
        }
    }

    public int getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }
    public double getSalary() { 
        return salary; 
    }

    public void showDetails() {
        System.out.println("===== Employee Details =====");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class Q36 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("Anish Gupta");
        e1.setSalary(45000);   // valid salary
        e1.showDetails();

        Employee e2 = new Employee();
        e2.setId(102);
        e2.setName("Rahul Kumar");
        e2.setSalary(-5000);   // invalid salary 
        e2.showDetails();
    }
}
