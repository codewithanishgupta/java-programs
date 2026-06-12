// 24. Write a Java program to create class Complex to add two complex numbers.

class Complex{
    int real;
    int imag;
    Complex(int r,int i){
        real=r;
        imag=i;
    }
    Complex add(Complex c){
       return new Complex(this.real+c.real,this.imag+c.imag);
    }
    void display(){
        System.out.println(real+"+"+imag+"i");
    }
}

public class AddComplexNumber {
    public static void main(String[] args) {
        Complex c1 = new Complex(12, 34);
        Complex c2 = new Complex(8,16);
        System.out.print("First data :");
        c1.display();
        System.out.print("Second data : ");
        c2.display();
        
        Complex sum=c1.add(c2);
        System.out.print("Sum Of number : ");
        sum.display();
    }
}
