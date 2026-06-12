// intance vs static Block

class A{

    int a=10;
    static int  b=30;
    {
        System.out.println("it is intance block....");
        System.out.println(a+" "+b);
    }

    static{
        System.out.println("It is static Block......");
        System.out.println(b);
    }
}

public class intance_static {
    public static void main(String arh[]){
       A r = new A();
    }
    
}
