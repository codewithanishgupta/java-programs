// 27. Create a Hotel Room Booking System using encapsulation

import java.util.Scanner;

class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        if(!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " booked successfully!");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void cancelBooking() {
        if(isBooked) {
            isBooked = false;
            System.out.println("Booking of Room " + roomNumber + " cancelled.");
        } else {
            System.out.println("Room " + roomNumber + " is not booked yet.");
        }
    }
}

class Hotel {
    private Room[] rooms;

    public Hotel(int totalRooms) {
        rooms = new Room[totalRooms];
        for(int i = 0; i < totalRooms; i++) {
            rooms[i] = new Room(i+1);
        }
    }

    public void showAvailableRooms() {
        System.out.println("=== Available Rooms ===");
        for(Room r : rooms) {
            if(!r.isBooked()) {
                System.out.println("Room " + r.getRoomNumber());
            }
        }
    }

    public void bookRoom(int roomNumber) {
        if(roomNumber > 0 && roomNumber <= rooms.length) {
            rooms[roomNumber-1].bookRoom();
        } else {
            System.out.println("Invalid room number!");
        }
    }

    public void cancelRoom(int roomNumber) {
        if(roomNumber > 0 && roomNumber <= rooms.length) {
            rooms[roomNumber-1].cancelBooking();
        } else {
            System.out.println("Invalid room number!");
        }
    }
}

public class Q27Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel h = new Hotel(5); // hotel with 5 rooms
        int choice;

        do {
            System.out.println("\n--- Hotel Booking Menu ---");
            System.out.println("1. Show Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: h.showAvailableRooms(); break;
                case 2: 
                    System.out.print("Enter room number to book: ");
                    h.bookRoom(sc.nextInt());
                    break;
                case 3: 
                    System.out.print("Enter room number to cancel: ");
                    h.cancelRoom(sc.nextInt());
                    break;
                case 4: 
                    System.out.println("Thank you for using Hotel Booking System!");
                    break;
                default: 
                    System.out.println("Wrong choice! Try again.");
            }
        } while(choice != 4);
    }
}
