import java.util.Scanner;

public class TicketBookingLimit {
    public static void main(String[] args) {
        final int MAX_TICKETS = 6;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets to book: ");
        int tickets = sc.nextInt();

        if (tickets > 0 && tickets <= MAX_TICKETS) {
            System.out.println("Booking successful for " + tickets + " ticket(s).");
        } else {
            System.out.println("Cannot book more than " + MAX_TICKETS + " tickets per transaction.");
        }
    }
}
