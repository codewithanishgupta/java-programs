// 29.Write a Java program to create an abstract class Exam and calculate grades for students.

abstract class Exam {
    String name;
    int roll;
    double marks;

    public Exam(String name , int roll , double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    
    abstract char calculateGrade(double marks);

    void display (){
        System.out.println("Name : "+name);
        System.out.println("Roll number : "+roll);
        System.out.println("Marks : "+marks);
        System.out.println("Grade : "+calculateGrade(marks));
        System.out.println("____________________________________");
    }
}

class Student extends Exam {

    public Student(String name , int roll , double marks) {
        super(name,roll, marks);
    }
    @Override
    char calculateGrade (double  marks){
        char grade;
        if(marks>=90 && marks <= 100)
            grade='A';
        else if(marks>=70 && marks < 90)
            grade='B';
        else if(marks>=50 && marks < 70)
            grade='C';
        else if(marks>=30 && marks < 50)
            grade='D';
        else 
            grade ='F';


        return grade;
    }
}
public class Q29 {
    public static void main(String[] args) {
        Exam s1 = new Student("Anish", 2421217, 97);
        s1.display();
        Exam s2 = new Student("Lado ", 2421129, 81);
        s2.display(); 
    }
}
