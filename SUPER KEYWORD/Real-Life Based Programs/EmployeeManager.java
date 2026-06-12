// 23.Write a Java program to create class Employee and Manager and use 
//      super to display details.


class Employee{
    String name;
    int id,salary;
    int wduration;

    public Employee(String name , int id ,int salary,int wduration) {
        this.name= name;
        this.id=id;
        this.salary=salary;
        this.wduration=wduration;
    }
    
}

class Manager extends Employee{
    int bonus,totals;

    public Manager(String name , int id ,int salary, int wduration) {
        super(name, id, salary  , wduration );
        this.bonus=500;
    }
    
    void display(){
        System.out.println("========Employess Details======");
        System.out.println("Name        : "+name);
        System.out.println("Id          : "+id);
        System.out.println("Salary      : "+salary);
        System.out.println("Wduration   : "+wduration+" hr");
        if(wduration>12){
            totals=salary+bonus;
        }else{
            bonus=0;
            totals=salary+bonus;
        }
        System.out.println("Total salary : "+totals+"  Add Bonus : "+bonus);
    }
}


public class EmployeeManager {
    public static void main(String[] args) {
        Manager M= new Manager("Anish", 5, 55000, 14);

        M.display();
    }
}
