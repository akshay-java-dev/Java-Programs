
class TicketBooking {
    private int availableTickets = 1;

    public synchronized void bookTicket(String user) {
        if (availableTickets > 0) {
            System.out.println(user + " booked ticket");
            availableTickets--;
        } else {
            System.out.println(user + " ticket unavailable");
        }
    }
}

public class TicketBookingExample {
    public static void main(String[] args)
            throws InterruptedException {

        TicketBooking booking = new TicketBooking();

        Thread t1 = new Thread(
            () -> booking.bookTicket("Akshay")
        );

        Thread t2 = new Thread(
            () -> booking.bookTicket("Rahul")
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
