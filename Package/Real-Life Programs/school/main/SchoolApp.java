package school.main;

import school.students.Student;
import school.teachers.Teacher;
import school.courses.Course;
import school.enrollment.Enrollment;
import school.services.SchoolService;

public class SchoolApp {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Anish", 10);
        Teacher t1 = new Teacher("T101", "Mr. Verma", "Mathematics");

        Course c1 = new Course("C201", "Algebra", t1);
        Enrollment e1 = new Enrollment("E301", s1, c1);

        SchoolService service = new SchoolService();
        service.enrollStudent(e1);

        Enrollment fetched = service.getEnrollment("E301");
        System.out.println("Fetched Enrollment: " + fetched.getEnrollmentId() +" | Student: " + fetched.getStudent().getName() + " | Course: " + fetched.getCourse().getCourseName());
    }
}
