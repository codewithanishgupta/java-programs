// 30.Write a Java program to demonstrate limitation of this keyword.


class Demo {
    int x;

    Demo(int x) {
        this.x = x;   // allowed resolve ambiguity
    }

    void show() {
        System.out.println("Value of x: " + this.x);  //  allowed
    }

    //  Limitation 1: tish ka use ham static method me nahi kar skte
    static void testStatic() {
        // System.out.println(this.x); 
    }

    //  Limitation 2: this ka use ham kisi another object ko refar nahi kar skte
    void compare(Demo d) {
        // this = d; // ERROR: 'this' cannot be assigned
    }

    //  Limitation 3: outside class con't use this 
}

// Driver class
public class Q30 {
    public static void main(String[] args) {
        Demo d1 = new Demo(100);
        d1.show();

        // Demo.testStatic(); // compile-time error
    }
}

