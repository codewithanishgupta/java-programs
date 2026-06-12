// 27. Create a Hotel Room Booking System. 

import java.util.Scanner;

class Client{
    private String name;
    private int age;
    private long aadhar;

    void setClientData(String name , int age , long aadhar) {
        this.name= name;
        this.age= age;
        this.aadhar = aadhar;
    }

    void clientDetails(){
        System.out.println("========Client Details========");
        System.out.println("Name        : "+name);
        System.out.println("Age         : "+age);
        System.out.println("Aadhar no . : "+aadhar);
    }
}

class Hotel{
    private Client [] clients;
    int count;

    public Hotel(int room) {
        clients = new Client[room];
        count =0;
    }

    void addClient(Client c){
        if(count < clients.length){
            clients[count++]=c;
            System.out.println("ROOM BOOKING.... Room No. : 200"+count);
        }else{
            System.out.println("All rooms are full..");
        }
    }

    void showAllClient(){
        System.out.println("-------All Client Details---------");
        for(int i=0; i<count ;i++){
            clients[i].clientDetails();
        }
    } 
}

public class Q27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel h = new Hotel(3);
        for(int i=0;i<3;i++){
            Client c = new Client();
            System.out.print("Enter Age : ");
            int age= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter client Name : ");
            String name= sc.nextLine();
            System.out.print("Enter Aadhar number : ");
            long aadhare= sc.nextLong();
            c.setClientData(name, age, aadhare);
            h.addClient(c);
        }
        h.showAllClient();
    }
}