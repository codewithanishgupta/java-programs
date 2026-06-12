// 19. Write a Java program to demonstrate use of object reference variable.

class Teacher{
    String name;
    int subcode;
    void setData(String name , int subcode){
        this.name=name;
        this.subcode=subcode;
    }
    void getData(){
        System.out.println("Teacher name; "+this.name);
        System.out.println("Teacher Subcode : "+this.subcode);
    }
}

public class ObjectReference {
    public static void main(String[] args) {
        Teacher t1= new Teacher();
        System.out.println("Access object t1 ");
        t1.setData("Anish", 402 );
        t1.getData();

        System.out.println("Access object t2 ");
        Teacher t2=t1;
        t2.getData();

        System.out.println("Access modify object t2 ");
        t2.setData("Simran", 304);
        t2.getData();

    }
}
