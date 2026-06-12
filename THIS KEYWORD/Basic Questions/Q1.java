// 1.Write a Java program to use this keyword to refer current class instance variable.

class Q1{
    int x;
    String name;

    public Q1(int x, String name) {
        this.x=x;
        this.name=name;

    }
    void display(){
        System.out.println("Value of x : "+x);
        System.out.println("Name  : "+name);
    }

    public static void main(String[] args) {
        Q1 Q= new Q1(10,"Anish gupta");
        Q.display();
    }
    
}

