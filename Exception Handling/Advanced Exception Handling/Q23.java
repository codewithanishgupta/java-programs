// 23.Write a Java program to create a Student Result System that throws an exception for invalid marks.

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int rollNo;
    double marks;

    public Student(String name, int rollNo, double marks) throws InvalidMarksException {
        this.name = name;
        this.rollNo = rollNo;
        validateMarks(marks);
        this.marks = marks;
    }

    private void validateMarks(double marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
    }

    void displayResult() {
        System.out.println("Student: " + name + " | Roll No: " + rollNo + " | Marks: " + marks);
        if (marks >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

public class Q23 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Anish Gupta", 101, 85); // valid marks
            s1.displayResult();

            Student s2 = new Student("Simran Jha", 102, 120); // invalid marks
            s2.displayResult();

        } catch (InvalidMarksException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception...");
    }
}