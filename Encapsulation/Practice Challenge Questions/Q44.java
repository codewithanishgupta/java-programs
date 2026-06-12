// 44. Create a School class with private student count. 

class School {
    private int studentCount;   

    public School(int studentCount) {
        if(studentCount >= 0) {
            this.studentCount = studentCount;
        } else {
            System.out.println("Invalid student count! Setting to 0.");
            this.studentCount = 0;
        }
    }

    public void addStudents(int count) {
        if(count > 0) {
            studentCount += count;
            System.out.println(count + " students added.");
        } else {
            System.out.println("Invalid number of students!");
        }
    }

    public void removeStudents(int count) {
        if(count > 0 && count <= studentCount) {
            studentCount -= count;
            System.out.println(count + " students removed.");
        } else {
            System.out.println("Invalid removal! Not enough students.");
        }
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void showDetails() {
        System.out.println("===== School Details =====");
        System.out.println("Total Students : " + studentCount);
    }
}

public class Q44 {
    public static void main(String[] args) {
        School s = new School(200); 
        s.showDetails();

        s.addStudents(50);
        s.showDetails();

        s.removeStudents(30);
        s.showDetails();

        s.removeStudents(300); 
        s.showDetails();
    }
}
