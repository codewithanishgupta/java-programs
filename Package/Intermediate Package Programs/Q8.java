// 8.Create a package college containing classes: Student, Teacher ->Import both classes into another program.

import college.Student;
import college.Teacher;

public class Q8 {
    public static void main(String[] args) {
        Student s = new Student("Anish", 29, 478);
        Teacher t = new Teacher("Brajesh", 38, "Math");

        s.show();
        t.show();
    }
}
