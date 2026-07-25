package college;

public class Student {
    String name ;
    int roll ;
    int marks ;

    public Student(String name , int roll , int marks) {
        this.name = name ;
        this.roll = roll ;
        this.marks = marks ;
    }

    public void show(){
        System.out.println("======== Student Details======");
        System.out.println("Name : "+name);
        System.out.println("Roll No. : "+roll);
        System.out.println("Marks : "+marks);
    }
    
}
