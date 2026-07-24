package employee;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name , int id , double salary) {
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }

    public void display() {
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee salary : "+salary);
    }
    
}
