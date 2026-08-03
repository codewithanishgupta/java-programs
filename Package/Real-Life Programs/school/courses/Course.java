package school.courses;

import school.teachers.Teacher;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;

    public Course(String courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public Teacher getTeacher() { return teacher; }
}
