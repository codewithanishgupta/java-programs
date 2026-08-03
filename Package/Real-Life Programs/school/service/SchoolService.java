package school.services;

import school.enrollment.Enrollment;
import java.util.HashMap;

public class SchoolService {
    private HashMap<String, Enrollment> enrollments = new HashMap<>();

    public void enrollStudent(Enrollment enrollment) {
        enrollments.put(enrollment.getEnrollmentId(), enrollment);
        System.out.println("Enrollment successful: " + enrollment.getEnrollmentId() +
                           " | Student: " + enrollment.getStudent().getName() +
                           " | Course: " + enrollment.getCourse().getCourseName());
    }

    public Enrollment getEnrollment(String enrollmentId) {
        return enrollments.get(enrollmentId);
    }
}
