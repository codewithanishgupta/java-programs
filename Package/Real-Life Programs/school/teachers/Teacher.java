package school.teachers;

public class Teacher {
    private String teacherId;
    private String name;
    private String subject;

    public Teacher(String teacherId, String name, String subject) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
    }

    public String getTeacherId() { return teacherId; }
    public String getName() { return name; }
    public String getSubject() { return subject; }
}
