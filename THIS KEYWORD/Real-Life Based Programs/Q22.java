// 22.Write a Java program to create class Employee using this for salary initialization.

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id , String name, double salary) {
        id=id;
        name=name;
        this.salary=salary;
    }
    void show(){
        System.out.println("========Employee details========");
        System.out.println("Employee id : "+ id);// 0 value
        System.out.println("Employee name : "+ name); // null value
        System.out.println("Employee salary : "+ salary);
    }
    

}

public class Q22 {
    public static void main(String[] args) {
        Employee E1= new Employee(2, "Anish Gupta", 1234344);
        E1.show();
        Employee E2 = new Employee(1, "Lado", 234543434);
        E2.show();
    }
}
