// 8. Create a Product class with private productId and productName. 



import java.util.Scanner;

class Product {
    private int productId;
    private String productName;

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
}

class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Enter Product ID : ");
        p.setProductId(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.print("Enter Product Name : ");
        p.setProductName(sc.nextLine());

        System.out.println("====== Product Details ======");
        System.out.println("Product ID : " + p.getProductId());
        System.out.println("Product Name : " + p.getProductName());
    }
}

