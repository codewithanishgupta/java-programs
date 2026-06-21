// 31.Write a Java program using both abstract class and interface.

interface Bonus {
    double calculateBonus(double salary);
}

abstract  class Employee {
    String name;
    double salary;
    int id;

    public Employee(String name , int id , double salary) {
        this.name = name;
        this.id = id ;
        this.salary = salary ;
    }
    
    abstract double calculateSalary();

    void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Id : "+id);
        System.out.println("Base salary : "+salary);
        System.out.println("Total Salary : "+calculateSalary());
        System.out.println("___________________________________________");
    }
    
}

class FullTimeEmployee extends Employee implements Bonus {
    double hra,da;

    public FullTimeEmployee(String name , int id , double salary , double hra , double da ) {
        super(name, id , salary);
        this.hra=hra;
        this.da = da;
    }
    @Override
    double calculateSalary(){
        return (salary+hra+da+calculateBonus(salary));
    }
    @Override
    public double calculateBonus(double salary){
        return salary*0.10;
    }
}

class PartTimeEmployee extends Employee implements Bonus {
    int hoursWorked;
    double ratePerHour;

    public PartTimeEmployee(String name, int id, double salary, int hoursWorked, double ratePerHour) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return (hoursWorked * ratePerHour) + calculateBonus(salary);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.05; 
    }
}

public class Q31 {
    public static void main(String[] args) {
         Employee e1 = new FullTimeEmployee("Anish Gupta", 101, 20000, 5000, 3000);
        Employee e2 = new PartTimeEmployee("Lado", 102, 8000, 40, 200);

        e1.display();
        e2.display();
    }
}