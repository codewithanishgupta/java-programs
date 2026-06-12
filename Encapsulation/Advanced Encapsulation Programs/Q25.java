
// 25. Create an Online Shopping Cart using encapsulated product details. 

import java.util.ArrayList;

class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String name , double price , int quantity) {
        if(price>0 && quantity>0){
            this.name= name;
            this.price = price;
            this.quantity = quantity;
        }else{
            System.out.println("Invalid produt details !.");
        }
    }

    double  getTotalPrice(){
        return (price*quantity);
    }

    void showProduct(){
        System.out.println(name + " (x"+quantity +")- Rs. "+ price + " each");
    }
}

class ShoppingCard{
    private ArrayList<Product> items = new ArrayList<>();

    void addProduct(Product p){
        items.add(p);
        System.out.println("Product added to cart !.");
    }

    double calculateTotal(){
        double total=0;
        for(Product p : items){
            total+=p.getTotalPrice();
        }
        return  total;
    }

    void showCard(){
        System.out.println("=====Card Details======");
        for(Product p : items){
            p.showProduct();
        }
        System.out.println("Total Bill Rs. : "+calculateTotal());
    }
}
public class Q25 {
    public static void main(String[] args) {
        ShoppingCard card = new ShoppingCard();
        card.addProduct(new Product("copy", 60, 4));
        card.addProduct(new Product("Pen", 10, 5));
        card.addProduct(new Product("Jhumka", 300, 1));
        card.showCard();
    }    
}
