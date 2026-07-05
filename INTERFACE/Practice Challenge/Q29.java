// 29.Student Result Management using interfaces. 


interface Result {
    void calculateResult ();
    void showResult ();
}

class Student implements Result {
    String name;
    int marks1, marks2 , marks3;
    double percentage;
    String grade;

    public Student(String name , int marks1 , int marks2 , int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    @Override
    public void calculateResult () {
        int total = marks1 + marks2 + marks3;
        percentage = total / 3.0 ;

        if (percentage >= 80)
            grade = "Distinction";
        else if (percentage >=60)
            grade = "First class";
        else if (percentage >= 40)
            grade = "Second class";
        else 
            grade = "Fail";
    }

    @Override
    public void showResult () {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------------");
    }
    
}

public class Q29 {
    public static void main(String[] args) {
        Student s1 = new Student("Anish", 80, 75, 90);
        Student s2 = new Student("Lado", 65, 70, 60);
        Student s3 = new Student("Priya", 40, 55, 50);

        s1.calculateResult();
        s1.showResult();

        s2.calculateResult();
        s2.showResult();

        s3.calculateResult();
        s3.showResult();
    }
}
