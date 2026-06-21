// 32.Write a Java program where an abstract class implements an interface.

interface Payable {
    double calculatePay();
}

abstract class Employee implements Payable {
    String name ;
    int id ;
    double baseSalary ;

    public Employee(String name , int id , double baseSalary) {
        this.name = name ;
        this.id = id ;
        this.baseSalary = baseSalary ;
    }
    
    abstract void display ();

    @Override
    public double calculatePay(){
        return baseSalary;
    }
}

class FullTimeEmployee extends Employee {
    double hra , da ;

    public FullTimeEmployee(String name , int id , double baseSalary , double hra , double da) {
        super(name, id, baseSalary);
        this.hra = hra ;
        this.da = da ;
    }

    @Override
    public double calculatePay(){
        return baseSalary + hra + da ;
    }

    @Override
    void display(){
        System.out.println("Fulltime Employee name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Total Pay : "+calculatePay());
        System.out.println("--------------------------------------------");
    }  
}

class PartTimeEmployee extends Employee {
    int hourWorked ;
    double ratePerHour;

    public PartTimeEmployee(String name , int id , double baseSalary , int hourWorked , double ratePerHour) {
        super(name, id, baseSalary);
        this.hourWorked = hourWorked ;
        this.ratePerHour = ratePerHour ;
    }

    @Override
    public double calculatePay(){
        return hourWorked * ratePerHour ;
    }
    
    @Override
    void display(){
        System.out.println("PartTime Employee name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Total Pay : "+calculatePay());
        System.out.println("--------------------------------------------");
    }
}

public class Q32 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Anish Gupta", 101, 20000, 5000, 3000);
        Employee e2 = new PartTimeEmployee("Lado", 102, 0, 40, 200);

        e1.display();
        e2.display();
    }
}
