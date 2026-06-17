// 24.Write a Java program to create an abstract class OnlineShopping with methods addToCart() and checkout()..

abstract class OnlineShopping {
    abstract void addToCart(String item , double price);
    abstract void checkout();
}

class AmazonShopping extends OnlineShopping {
    double total = 0;
    @Override
    void addToCart(String item , double price){
        total += price ;
        System.out.println(item+" Added to card. Price : "+price);
    }
    @Override
    void checkout(){
        System.out.println("CheckOut Total Bill : "+total);
    }
}

class FlipkartShopping extends OnlineShopping {
    double total = 0;
    @Override
    void addToCart(String item , double price){
        total += price ;
        System.out.println(item+" Added to Flipkart card. Price : "+price);
    }
    @Override
    void checkout(){
        System.out.println("CheckOut Total Bill : "+total);
    }
}
public class Q24 {
    public static void main(String[] args) {
        OnlineShopping amazon = new AmazonShopping();
        amazon.addToCart("Fridge", 16499);
        amazon.addToCart("Cooler", 34000);
        amazon.checkout();

        OnlineShopping flipkart = new FlipkartShopping();
        flipkart.addToCart("Facewash", 399);
        flipkart.addToCart("Sunscreen", 345);
        flipkart.checkout();
    }
}
