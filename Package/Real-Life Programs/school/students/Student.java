package school.students;

public class Student {
    private String studentId;
    private String name;
    private int grade;

    public Student(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getGrade() { return grade; }
}
