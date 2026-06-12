// 48.  Create a CourseEnrollment class with seat limits. 

class CourseEnrollment{
    private int totalSeats;
    private int enrolled;

    public CourseEnrollment(int totalSeats) {
        if(totalSeats>0){
            this.totalSeats=totalSeats;
            this.enrolled=0;
        }else{
            System.out.println("Invalid seats capacity! setting to 0");
            this.totalSeats=0;
        }
    }

    void enrolled(int count){
        if(count >0){
            if(enrolled + count <= totalSeats){
                enrolled+=count;
                System.out.println(count + " student(s) enrolled successfully!");
            }else{
                System.out.println("Cannot enroll " + count + " students. Seat limit exceeded!");
            }
        }else{
            System.out.println("Invalid enrollment request!");
        }
    }

    void showDetails(){
        System.out.println("===== Course Enrollment Status =====");
        System.out.println("Total Seats     : " + totalSeats);
        System.out.println("Enrolled        : " + enrolled);
        System.out.println("Available Seats : " + (totalSeats - enrolled));
    }   

}

public class Q48 {
    public static void main(String[] args) {
        CourseEnrollment course = new CourseEnrollment(20);
        course.showDetails();

        course.enrolled(15);
        course.showDetails();

        course.enrolled(20);
        course.showDetails();

        course.enrolled(5);
        course.showDetails();

    }
}
