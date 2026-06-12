// 46. Create a FlightBooking class with available seats. 

class FlightBooking{
    private int seats;
    private boolean available;

    public FlightBooking(int capacity) {
        if(capacity > 0){
            this.seats=capacity;
            available = true;

        }else{
            System.out.println("Invalid seat capacity !. must be positive");
        }
    }

    void bookingSeats(int ticket){
        if (!available) {
            System.out.println("No seats available!");
            return;
        }
        if (ticket > 0 && ticket <= seats) {
            seats -= ticket;
            System.out.println(ticket + " seat(s) booked successfully!");
        } else {
            System.out.println("Sorry! Requested seats not available.");
        }
        checkSeat(); 
    }

    void checkSeat(){
        if (seats > 0) {
            available = true;
            System.out.println("Seats available: " + seats);
        } else {
            available = false;
            System.out.println("Seats are not available.");
        }
    }  
}


public class Q46 {
    public static void main(String[] args) {
        FlightBooking Fl = new FlightBooking(10);
        Fl.checkSeat();

        Fl.bookingSeats(7);

        Fl.bookingSeats(5);

        Fl.bookingSeats(3);
        Fl.checkSeat();
        
    }
}
