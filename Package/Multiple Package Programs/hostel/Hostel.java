package hostel;

import college.Student;

public class Hostel {
    private Student student;
    private String hostelName;
    private int roomNo;

    public Hostel(Student student, String hostelName, int roomNo) {
        this.student = student;
        this.hostelName = hostelName;
        this.roomNo = roomNo;
    }

    public void displayHostelDetails() {
        System.out.println("\n=== Hostel Details ===");
        student.display();
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Room No: " + roomNo);
    }
}
