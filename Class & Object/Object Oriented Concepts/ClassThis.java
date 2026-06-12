// 18. Write a Java program to use this keyword to resolve ambiguity.

class Student{
    String name;
    int roll,marks;

    void setData(String name,int roll,int marks){
        this.name= name;
        this.roll=roll;
        this.marks=marks;
    }
    void getData(){
        String name="\0";
        int roll=0,marks=0;
        System.out.println("Without this keyword name : "+name);
        System.out.println("With this keyword name : "+this.name);
        System.out.println("Without this keyword roll : "+roll);
        System.out.println("With this keyword roll : "+this.roll);
        System.out.println("Without this keyword marks : "+marks);
        System.out.println("With this keyword marks : "+this.marks);
    }
}


public class ClassThis {
    public static void main(String[] args) {
        Student s=new Student();
        s.setData("Anish", 29 , 510);
        s.getData();
    }
}
