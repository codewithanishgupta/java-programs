// 20.Create packages: college ,hostel , Store and display student details.

import college.Student;
import hostel.Hostel;

public class Q20 {
    public static void main(String[] args) {
        Student s1 = new Student("Anish", 101, "BCA");
        Hostel h1 = new Hostel(s1, "Ganga Hostel", 12);

        h1.displayHostelDetails();
    }
}
