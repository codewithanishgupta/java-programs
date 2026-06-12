// 15.Write a Java program to use super keyword in method overriding scenario.

class A{
    int sum=0;
    int a,b;
    int sum(int a,int b){
        this.a=a;
        this.b=b;
        sum=this.a+this.b;
        return sum;
    }
}

class Print extends A{
    @Override
    int sum(int a, int b){
    return super.sum(a, b);
    }
}

public class MethodScenario {
    public static void main(String[] args) {
        Print P= new Print();
        int result=P.sum(10,20);
        System.out.println("Sum of number : "+result);
    }
}
