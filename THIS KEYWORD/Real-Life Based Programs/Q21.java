// 21.Write a Java program to create class Student using this to initialize id and name.

class Student {
    int id;
    String name;
    void input(int id, String name){
        this.id=id;
        this.name=name;
    }
    void show(){
        System.out.println("Student id : "+id);
        System.out.println("Student name : "+name);
    }
}

public class Q21 {
    public static void main(String[] args) {
        Student S= new Student();
        S.input(10, "Anish gupta");
        S.show();
    }
}
