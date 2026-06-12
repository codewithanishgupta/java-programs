// 13. Write a Java program to return object from method.

class Student{
    int id;
    String name;
    Student(String name , int id ){
        this.name = name;
        this.id= id;
    }
    void show(){
        System.out.println("Student name : "+name);
        System.out.println("Student id : "+id);
    }
}
public class REturnObjectFromMethod {
    static Student createstudent(){

        Student s=new Student("Anish",29);
        return s;
    }
    public static void main(String[] args) {
    Student obj; /// ya ham student obj=createstudent bhi likh skte hai
    obj=createstudent();
    obj.show();
    }
}
