// 34. Write a program to show encapsulation in a Student class. 


class Student {

    private String name;
    private int rollNo;
    private int age;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setMarks(double marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100!");
        }
    }

    public String getName() { 
        return name; 
    }
    public int getRollNo() {
        return rollNo; 
    }
    public int getAge() { 
        return age;
    }
    public double getMarks() {
        return marks; 
    }

    public void showDetails() {
        System.out.println("===== Student Details =====");
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Age    : " + age);
        System.out.println("Marks  : " + marks);
    }
}

public class Q34 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Anish Gupta");
        s.setRollNo(29);
        s.setAge(21);
        s.setMarks(88.5);

        s.showDetails();
    }
}
