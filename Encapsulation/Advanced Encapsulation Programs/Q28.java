// 28. Create a Railway Reservation System. 

import java.util.Scanner;

class Passenger{
    private String name;
    private int age;
    private String trainName;
    private int seatNo;

    void setPassengerData(String name, int age, String trainName, int seatNo){
        this.name=name;
        this.age=age;
        this.trainName=trainName;
        this.seatNo=seatNo;
    }
    
    void showDetails(){
        System.out.println("========Passenger Details=========");
        System.out.println("Name        : "+name);
        System.out.println("Age         : "+age);
        System.out.println("Train Name  : "+trainName);
        System.out.println("Seat No     : "+seatNo);
    }
}

class RailwayReservation{
    private Passenger passengers[];
    private int count;

    public RailwayReservation(int capacity) {
        passengers=new Passenger[capacity];
        count =0;
    }

    void bookingTicket(Passenger p){
        if(count < passengers.length){
            passengers[count++]=p;
            System.out.println("Ticket Booked successfuly ! seat no . : "+pSetNo(count));
        }else{
            System.out.println("All seats are full!");
        }
    }

    public int passengersCount() {
        return count;
    }

    int pSetNo(int index){
        return 100+index;
    }

    void showAllReservation(){
        System.out.println("=======All Reservations======\n");
        for(int i=0;i<count;i++){
            passengers[i].showDetails();
        }
    }

    int iSeatNo(int index) {
        return 100 + index;
    }

    public void cancelTicket(int seatNo) {
        boolean found = false;
        for(int i = 0; i < count; i++) {
            if(passengers[i] != null && iSeatNo(i+1) == seatNo) {
                System.out.println("Ticket for Seat No " + seatNo + " cancelled.");
                passengers[i] = null;
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("No reservation found for Seat No " + seatNo);
        }
    }
    
}


public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RailwayReservation rr = new RailwayReservation(3); // capacity 3 passengers
        int choice;

        do {
            System.out.println("\n--- Railway Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Show All Reservations");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    Passenger p = new Passenger();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Train Name: ");
                    String train = sc.nextLine();
                    int seatNo = 100 + (rr.passengersCount() + 1);
                    p.setPassengerData(name, age, train, seatNo);
                    rr.bookingTicket(p);
                    break;
                case 2:
                    rr.showAllReservation();
                    break;
                case 3:
                    System.out.print("Enter Seat No to cancel: ");
                    int seat = sc.nextInt();
                    rr.cancelTicket(seat);
                    break;
                case 4:
                    System.out.println("Thank you for using Railway Reservation System!");
                    break;
                default:
                    System.out.println("Wrong choice! Try again.");
            }
        } while(choice != 4);
    }
}
