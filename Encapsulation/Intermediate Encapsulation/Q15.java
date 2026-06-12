// 15.Create a Person class where age cannot be less than 0. 

class Person {
    private String name;
    private int age;

    void setName(String name){
        this.name= name;
    }

    void setAge(int age){
        if(age>0)
            this.age=age;
        else
            System.out.println("Invalid Age !");
    }

    void personDetails(){
        System.out.println("Name of Person : "+name);
        System.out.println("Age of Person : "+age);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Simmu Bhardvaj");
        p.setAge(21);
        p.personDetails();
        p.setAge(-12);      // worng
        p.personDetails();
    }
}
