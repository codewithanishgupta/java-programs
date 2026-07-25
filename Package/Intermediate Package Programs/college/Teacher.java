package college;

public class Teacher {
    String name;
    int age;
    String subject;

    public Teacher(String name , int age , String subject) {
        this.name = name ;
        this.age = age ;
        this.subject = subject ;
    }

    public void show(){
        System.out.println("========= Teacher Details ===========");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Subject : "+subject);
    }
}
