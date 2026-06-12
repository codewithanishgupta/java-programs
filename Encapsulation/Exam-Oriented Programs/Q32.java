// 32. Create a class with private data members and public getter/setter methods. 

class Student{
    private String name;
    private int id;
    private int roll;
    private int age;

    public void setName(String name ){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setAge(int age){
        this.age= age;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getRoll(){
        return roll;
    }
    public int getAge(){
        return age;
    }
}

public class Q32 {
    public static void main(String[] args) {
        Student s= new Student();
        s.setName("Anish Gupta");
        s.setId(2);
        s.setRoll(29);
        s.setAge(21);

        System.out.println("====Student Details=====");
        System.out.println("Name : "+s.getName());
        System.out.println("Id : "+s.getId());
        System.out.println("Roll : "+s.getRoll());
        System.out.println("Age : "+s.getAge());
    }
}
