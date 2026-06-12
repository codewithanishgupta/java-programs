// 3.Write a Java program to use this keyword inside a method.


class Bank{
    String authorName;
    int blance;

    void  setdata(int blance , String authorname){
        this.blance=blance;
        this.authorName=authorname;
    }

    void display(){
        System.out.println("Authorname is : "+authorName);
        System.out.println("Blance  is : "+blance);
    }
}


public class Q3 {
    public static void main(String[] args) {
        Bank B= new Bank();
        B.setdata(26000, "Anish gupta");
        B.display();
    }
}
