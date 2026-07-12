// 18.Create a class Person with method showRole(). Override it in:Teacher,Student,

class Person {
    void showRole() {
        System.out.println("Person has a role...");
    }
}

class Teacher extends Person {
    @Override
    void showRole() {
        System.out.println("Teacher's role: Teaching students and guiding them.");
    }
}

class Student extends Person {
    @Override
    void showRole() {
        System.out.println("Student's role: Learning and gaining knowledge.");
    }
}

public class Q18 {
    public static void main(String[] args) {
        Person p;

        p = new Teacher();
        p.showRole();

        p = new Student();
        p.showRole();
    }
}