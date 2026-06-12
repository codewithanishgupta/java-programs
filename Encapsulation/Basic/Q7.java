// 7. Create a College class with private collegeName and location. 

import java.util.Scanner;

class College {
    private String collegeName;
    private String location;

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollegeName() {
        return collegeName;
    }
    public String getLocation() {
        return location;
    }
}

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College c = new College();

        System.out.print("Enter College Name : ");
        c.setCollegeName(sc.nextLine());

        System.out.print("Enter College Location : ");
        c.setLocation(sc.nextLine());

        System.out.println("====== College Details ======");
        System.out.println("College Name : " + c.getCollegeName());
        System.out.println("Location : " + c.getLocation());
    }
}
