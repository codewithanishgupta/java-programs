// 27. Write a Java program to create class ShoppingCart to add items and calculate 
//      total bill.

import java.util.Scanner;

class ShopppingCart {
    String itemsname [];
    double itemsprice [];
    int count=0;

    ShopppingCart(int size) {
        itemsname=new String[size];
        itemsprice=new double[size];
        count=0;
    }
    void addItem(String name,double price)
    {
        if(count<itemsname.length){
            itemsname[count]=name;
            itemsprice[count]=price;
            count++;
        }else{
            System.out.println("Cart is full, can not add more items!");
        }
    }
    
    double calculateTotal(){
        double total=0;
        for(int i=0;i<count;i++){
            total+=itemsprice[i];
        }
        return total;
    }

    void displayCart(){
        System.out.println("Items in cart : ");
        for(int i=0;i<count;i++){
            System.out.println(itemsname[i]+"-Rs."+itemsprice[i]);
        }
        System.out.println("Total Bill : Rs."+calculateTotal());
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s;
        System.out.println("Size of items in cart : ");
        s=sc.nextInt();
        ShopppingCart cart=new ShopppingCart(s);
        cart.addItem("Book",200.50);
        cart.addItem("pen", 20.00);
        cart.addItem("coppy", 100.00);
        cart.displayCart();
    }
    

}
