// 37. Write a program to restrict direct access to class data. 

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
        if(salary >= 0) {
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

public class Q37 {
    public static void main(String[] args) {
        Employee e = new Employee();

        // direct access not allowed = e.salary = 5000; 
        // controlled access via setters 
        e.setId(101);
        e.setName("Anish Gupta");
        e.setSalary(45000);

        e.showDetails();

        e.setSalary(-1000); // validation restricts wrong data
        e.showDetails();
    }
}
