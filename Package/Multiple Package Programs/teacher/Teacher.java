package teacher;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
