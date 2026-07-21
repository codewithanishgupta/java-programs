// 33.Railway Reservation System using exception handling.


class ReservationException extends Exception {
    public ReservationException(String message) {
        super(message);
    }
}

class RailwayReservation {
    private int totalSeats;

    public RailwayReservation(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void bookSeats(int seats) throws ReservationException {
        if (seats <= 0) {
            throw new ReservationException("Invalid number of seats to book.");
        } else if (seats > totalSeats) {
            throw new ReservationException("Not enough seats available. Current seats: " + totalSeats);
        } else {
            totalSeats -= seats;
            System.out.println("Booking successful! Seats booked: " + seats + " | Remaining seats: " + totalSeats);
        }
    }

    public void cancelSeats(int seats) throws ReservationException {
        if (seats <= 0) {
            throw new ReservationException("Invalid number of seats to cancel.");
        } else {
            totalSeats += seats;
            System.out
                    .println("Cancellation successful! Seats cancelled: " + seats + " | Current seats: " + totalSeats);
        }
    }

    public void displaySeats() {
        System.out.println("Available seats: " + totalSeats);
    }
}

public class Q33 {
    public static void main(String[] args) {
        System.out.println("--------- Railway Reservation System ----------");

        RailwayReservation train = new RailwayReservation(10);

        train.displaySeats();

        try {
            train.bookSeats(4);
            train.bookSeats(8);
        } catch (ReservationException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            train.cancelSeats(-2);
        } catch (ReservationException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            train.cancelSeats(3);
        } catch (ReservationException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        train.displaySeats();
    }
}