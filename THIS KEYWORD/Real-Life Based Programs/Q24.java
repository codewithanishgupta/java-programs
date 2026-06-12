// 24.Write a Java program to create class Product using this for price and quantity.

class Product{
    String name;
    int price,quantity;

    void input(String name, int price , int quantity){
        this.name= name;
        this.price=price;
        this.quantity=quantity;
    }
    void show(){
        System.out.println("=============Product Details========");
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
    }
}

public class Q24 {
    public static void main(String[] args) {
        Product p = new Product();
        p.input("Young Moung", 2999, 49);
        p.show();
    }
}
