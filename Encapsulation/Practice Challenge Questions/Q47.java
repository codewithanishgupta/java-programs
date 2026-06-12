// 47. Create a GymMember class with membership details. 

class GymMember{
    private String name;
    private int age;
    private String membership;  // monthly / yearly
    private int duration;           // in month

    public GymMember(String name , int age , String membership , int duration) {
        this.name= name;
        if(age>0)
            this.age = age;
        else{
            System.out.println("invalid age! setting age 0");
            this.age=0;
        }         
        this.membership= membership;
        if(duration>0)
            this.duration= duration;
        else{
            System.out.println("Invalid duration ! setting duration 1 "); 
            this.duration=1;
        }      
    }

    void setMembership(String membership){
        this.membership= membership;
    }
    void setDuration(int duration){
        if(duration>0)
            this.duration= duration;
        else
            System.out.println("Invalid Duration!");
    }

    String getNmae(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getMembership(){
        return membership;
    }
    int getDuration(){
        return duration;
    }

    void showDetails(){
        System.out.println("===== GymMember Details =====");
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Membership Type : " + membership);
        System.out.println("Duration        : " + duration + " months");
    }
    
}

public class Q47 {
    public static void main(String[] args) {
        GymMember gm = new GymMember("Anish Gupta", 21,"yearly", 12);
        gm.showDetails();

        gm.setMembership("monthly");
        gm.setDuration(8);

        gm.showDetails();
    }
}
