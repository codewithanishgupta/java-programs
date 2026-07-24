package student;

public class Student {
    int roll;
    String name;

    public void setdata(String name , int roll){
        this.name = name ;
        this.roll = roll ;
    }

    public void getdata(){
        System.out.println("Student name : "+name);
        System.out.println("Student roll : "+roll);
    }
}
