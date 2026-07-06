// 8. Create classes: University,College,Student Store and display information from each class.

class University {
    String uniName;
    String location;

    void displayUniversity() {
        System.out.println("University Name: " + uniName);
        System.out.println("Location: " + location);
    }
}

class College extends University {
    String collegeName;

    void displayCollege() {
        displayUniversity();
        System.out.println("College Name: " + collegeName);
    }
}

class Student extends College {
    String studentName;
    int rollNo;

    void displayStudent() {
        displayCollege();
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Student s = new Student();
        s.uniName = "Bihar University";
        s.location = "Muzaffarpur , Bihar";
        s.collegeName = "MPSsc Science College";
        s.studentName = "Anish Gupta";
        s.rollNo = 29;

        s.displayStudent();
    }
}
