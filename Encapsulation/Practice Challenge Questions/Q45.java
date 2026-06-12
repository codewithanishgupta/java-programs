// 45. Create a CinemaTicket class with seat availability management. 

class CinemaTicket {
    private boolean available;
    private int seat;

    public CinemaTicket(int seat) {
        if(seat>0){
            this.seat= seat;
            available = true;
        }else{
            System.out.println("Invalid seat must gratter than 0 !.");
        }
    }

    void bookTickets(int tickets){
        if(available){
            if( tickets > 0 && tickets <= seat){
                this.seat-=tickets;
                System.out.println("Ticket Booked successfully.........");
            }else{
                System.out.println("Sorry! Seat is not available.... ");
                System.out.println("Only "+seat+ " seats available");
            }
        }
    }

    void checkTicket(){
        if(seat>0){
            available=true;
            System.out.println("Ticket is available..");
        }else{
            available = false;
            System.out.println("Ticket is not available...");
        }
    }
    
}


public class Q45  {
    public static void main(String[] args) {
        CinemaTicket ci = new CinemaTicket(10);
        ci.checkTicket();

        ci.bookTickets(6);
       // ci.checkTicket();

        ci.bookTickets(10);
   
    }
}
