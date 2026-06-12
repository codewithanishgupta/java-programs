// 19.Create a LibraryBook class where quantity cannot become negative. 

class LibraryBook {
    private String title;
    private int quantity;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid Quantity! Cannot be negative.");
        }
    }

    public void showDetails() {
        System.out.println("Book Title: " + title + ", Quantity: " + quantity);
    }
}


public class Q19 {
    public static void main(String[] args) {
        LibraryBook l = new LibraryBook();
        l.setTitle("Java Programming");
        l.setQuantity(20);
        l.showDetails();
    }
}
