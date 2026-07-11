// 6. Create a class PrintData and overload the method print() for:int,float,String,char 

class PrintData {

    void print(int num) {
        System.out.println("Printing int: " + num);
    }

    void print(float num) {
        System.out.println("Printing float: " + num);
    }

    void print(String text) {
        System.out.println("Printing String: " + text);
    }

    void print(char ch) {
        System.out.println("Printing char: " + ch);
    }
}

public class Q6 {
    public static void main(String[] args) {
        PrintData p = new PrintData();

        p.print(100);
        p.print(12.34f);
        p.print("Anish Gupta");
        p.print('A');
    }
}
