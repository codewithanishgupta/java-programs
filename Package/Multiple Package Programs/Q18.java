// 18.Create three packages: student, teacher ,course Display information from all three.

import student.Student;
import teacher.Teacher;
import course.Course;

public class Q18 {
    public static void main(String[] args) {
        Student s1 = new Student("Anish", 101);
        Teacher t1 = new Teacher("Mr. Sharma", "Java Programming");
        Course c1 = new Course("OOP in Java", 6);

        System.out.println("=== Student Info ===");
        s1.display();

        System.out.println("\n=== Teacher Info ===");
        t1.display();

        System.out.println("\n=== Course Info ===");
        c1.display();
    }
}
