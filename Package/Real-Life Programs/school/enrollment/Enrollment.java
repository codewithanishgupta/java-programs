package school.enrollment;

import school.students.Student;
import school.courses.Course;

public class Enrollment {
    private String enrollmentId;
    private Student student;
    private Course course;

    public Enrollment(String enrollmentId, Student student, Course course) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
    }

    public String getEnrollmentId() { return enrollmentId; }
    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
}
