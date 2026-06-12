// 25. Write a Java program to create class Time to add two time objects.

class Time{
    int hour,minutes,sec;
    Time(int h,int m,int s){
        hour=h;
        minutes=m;
        sec=s;
    }
    Time add(Time t){
        int newhour=this.hour+t.hour;
        int newminutes=this.minutes+t.minutes;
        int newsec=this.sec+t.sec;
        while(newminutes>=60 ||newsec>=60 ){

            if(newsec>=60){
                newsec-=60;
                newminutes++;
            }
            if(newminutes>=60){
                newminutes-=60;
                newhour++;
            }
        }
        return new Time(newhour,newminutes,newsec);
    }
    void display(){
        System.out.println("Time :"+hour+":"+minutes+":"+sec);
    }
}

public class AddTimeToObject {
    public static void main(String[] args) {
        Time t1=new Time(12,45,87);
        Time t2=new Time(5,34,58);
        System.out.print("First ");
        t1.display();
        System.out.println("Second ");
        t2.display();

        Time sum=t1.add(t2);
        System.out.println("After sum ");
        sum.display();
    }
}
