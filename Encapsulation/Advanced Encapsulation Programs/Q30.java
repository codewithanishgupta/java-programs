// 30. Create an Inventory Management System.

import java.util.Scanner;

class Product{
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(int id, String name, int quantity, double price) {
        this.id=id;
        this.name= name;
        this.quantity=quantity;
        this.price=price;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }

    public void updateQuantitry(int qty){
        if(qty>=0){
            this.quantity = qty;
            System.out.println("Quantity update successfully!");
        }else{
            System.out.println("Invalid Quantity!.");
        }
    }

    public void showDetails(){
        System.out.print("ID : "+id+"\t");
        System.out.print("\tName : "+name+"\t");
        System.out.print("\tQuantity : "+quantity+"\t");
        System.out.print("\tPrice : "+price+"\n");
    }
}

class Inventory{
    private Product[] products;
    private int count;

    public Inventory(int size){
        products=new Product[size];
        count =0;
    }

    public void addProduct(Product p){
        if(count < products.length){
            products[count++]=p;
            System.out.println("Product Added successfuly!.");
        }else{
            System.out.println("Inventory full !.");
        }
    }

    public void showAllProducts(){
        System.out.println("=====Inventory Product=====");
        for(int i=0 ; i<count;i++){
            products[i].showDetails();
        }
    }

    public void updateProduct(int id , int newqty){
        for(int i=0 ; i<count ; i++){
            if(products[i].getId()==id){
                products[i].updateQuantitry(newqty);
                System.out.println("Update successfully!");
                return ;
            }
        }
        System.out.println("Product not found!");
    }

    public void deleteProduct(int id){
        for(int i=0 ; i<count ;i++){
            if(products[i].getId()==id){
                System.out.println("Product "+products[i].getName()+" deleted.");
                products[i]=products[count-1];
                products[count-1]=null;
                count--;
                return;
            }
        }
        System.out.println("Product Not Found!.");
    }
}

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Inventory : ");
        int n = sc.nextInt();
        Inventory inv = new Inventory(n);
        int choice;
        do { 
            System.out.println("\n-------- Inventory Menu ---------\n");
            System.out.println("1.  Add Product");
            System.out.println("2.  Show All Product");
            System.out.println("3.  Update Product Quantity");
            System.out.println("4.  Delete Product");
            System.out.println("5.  Exit.");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 : {
                     System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    inv.addProduct(new Product(id, name, qty,price));
                    break;
                }   

                case 2 : {
                    inv.showAllProducts();
                    break;
                }

                case 3 : {
                    System.out.print("Enter product id to update : ");
                    int uid= sc.nextInt();
                    System.out.print("Enter new Quantity : ");
                    int qty=sc.nextInt();
                    inv.updateProduct(uid, qty);
                    break ;
                }

                case 4 : {
                    System.out.print("Enter product id to delete product : ");
                    int id = sc.nextInt();
                    inv.deleteProduct(id);
                    break ;
                }

                case 5 : {
                    System.out.println("Thank you for using Inventory Management System. 😊❤️");
                    break;
                }

                default : {
                    System.out.println("Worng choice! \n Try again......");
                }
            }
        } while (choice != 5);
    }
}