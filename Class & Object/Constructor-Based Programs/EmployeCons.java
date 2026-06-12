// 9. Write a Java program to create a class Employee with constructor to initialize data.


class Employee{
    String name = new String();
    int id,sal;

    public Employee(String s , int i ,int sa) {
        name = s;
        id=i;
        sal=sa;
    }
    void show(){
        System.out.println("Enployee details.....\n");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salery : "+sal);
    }
}
public class EmployeCons {
    public static void main(String[] args) {
        Employee obj = new Employee("Anish",29,7800);
        obj.show();
    }
}
