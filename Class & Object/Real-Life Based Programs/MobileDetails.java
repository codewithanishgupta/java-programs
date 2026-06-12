// 30. Write a Java program to create class Mobile with features and display them.

class Mobile{
    String brandname,model,display;
    double price;
    int camera,ram,storage;

    public Mobile() {
        brandname="Redmi Not 10s";
        model="2026ERN9CI";
        camera=120;
        display="Full HD";
        ram=16;
        storage=128;
        price=24999.00;
    }

    void display(){
        System.out.println("\n=========Mobile Details==========\n");
        System.out.println("Name                :   "+brandname);
        System.out.println("Modal               :   "+model);
        System.out.println("Camera              :   "+camera+" MP");
        System.out.println("Ram                 :   "+ram+" GB");
        System.out.println("Storage             :   "+storage+" GB");
        System.out.println("Price_______________:   Rs."+price);
    }
    

}

public class MobileDetails {
    public static void main(String[] args) {
        Mobile M=new Mobile();
        M.display();
    }
}
