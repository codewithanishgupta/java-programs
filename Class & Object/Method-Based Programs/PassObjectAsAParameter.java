// 12. Write a Java program to pass object as parameter to method.

class student{
    String name;
    int roll;
    void input(String n,int r){
        name= n;
        roll=r;
    }
}
public class PassObjectAsAParameter {
    void display(student s){
        System.out.println("Student name : "+s.name);
        System.out.println("Student roll : "+s.roll);
    }
    public static void main(String[] args) {
        
        student s=new student();
        s.input("Anish",29);
        PassObjectAsAParameter obj = new PassObjectAsAParameter();
        obj.display(s);
    }
    
}
