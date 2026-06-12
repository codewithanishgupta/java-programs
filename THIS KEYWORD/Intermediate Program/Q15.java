// 15.Write a Java program to use this keyword in method chaining.


class Calculator{
    int result;

    Calculator add(int num){
        result+=num;
        return this;
    }

    Calculator sub(int num){
        result -=num;
        return this;
    }

    Calculator mul(int num){
        result *=num;
        return this;
    }

    void display(){
        System.out.println("Result is : "+result);
    }
    
}

public class Q15 {
    public static void main(String[] args) {
        Calculator C= new Calculator();
        C.add(10);
        C.display();
        C.sub(5);
        C.display();
        C.mul(3);
        C.display();

        C.add(20).sub(10).mul(5).display();
    }
}
