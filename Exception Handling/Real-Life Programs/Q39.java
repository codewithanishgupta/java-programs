// 39.Movie Ticket Booking System with seat availability exception.

class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}

class MovieTheatre {
    private String movieName;
    private int totalSeats;
    private int bookedSeats;

    public MovieTheatre(String movieName, int totalSeats) {
        this.movieName = movieName;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public void bookTickets(int seats) throws SeatUnavailableException {
        if (seats <= 0) {
            throw new SeatUnavailableException("Invalid number of seats to book.");
        }
        if (bookedSeats + seats > totalSeats) {
            throw new SeatUnavailableException("Not enough seats available. Free seats: " + (totalSeats - bookedSeats));
        }
        bookedSeats += seats;
        System.out.println("Booking successful! Movie: " + movieName + " | Seats booked: " + seats
                + " | Remaining seats: " + (totalSeats - bookedSeats));
    }

    public void cancelTickets(int seats) throws SeatUnavailableException {
        if (seats <= 0) {
            throw new SeatUnavailableException("Invalid number of seats to cancel.");
        }
        if (seats > bookedSeats) {
            throw new SeatUnavailableException(
                    "Cannot cancel more seats than booked. Currently booked: " + bookedSeats);
        }
        bookedSeats -= seats;
        System.out.println("Cancellation successful! Seats cancelled: " + seats + " | Remaining seats: "
                + (totalSeats - bookedSeats));
    }

    public void displayStatus() {
        System.out.println("Movie: " + movieName + " | Total seats: " + totalSeats + " | Booked: " + bookedSeats
                + " | Free: " + (totalSeats - bookedSeats));
    }
}

public class Q39 {
    public static void main(String[] args) {
        System.out.println("--------- Movie Ticket Booking System ---------");

        MovieTheatre theatre = new MovieTheatre("Avengers: Endgame", 10);

        theatre.displayStatus();

        try {
            theatre.bookTickets(4);
            theatre.bookTickets(8);
        } catch (SeatUnavailableException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }

        try {
            theatre.cancelTickets(0);
        } catch (SeatUnavailableException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }

        try {
            theatre.cancelTickets(3);
        } catch (SeatUnavailableException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }

        theatre.displayStatus();
    }
}