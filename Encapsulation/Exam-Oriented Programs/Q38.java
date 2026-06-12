// 38. Write a program to update and display employee information through methods. 

class Employee {
    private int id;
    private int salary;
    private String name;

    public Employee(int id , int salary , String name) {
        this.id=id;
        this.salary=salary;
        this.name=name;
    }

    public void update(int id , int salary , String name){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }

    public void show(){
        System.out.println("------Employee Details-----");
        System.out.println("Name : "+name);
        System.out.println("id : "+id);
        System.out.println("Salary : "+salary);
        
    }
}

public class Q38 {
    public static void main(String[] args) {
        Employee e = new Employee(2, 3454, "Anish Gupta");
        e.show();
        
        // update data  using method
        e.update(1, 6556, "Simmu");
        e.show();
    }
}
