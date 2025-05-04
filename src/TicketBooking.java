import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {

        int totalTicket = 100;


        System.out.println("Welcome to the Ticket Bookin System!");
        System.out.println("Enter Customer Name ,No. of booking tickets ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        List<TicketBooking> ticketBookings = new ArrayList<>();


        do {


            switch (i) {
                case 1:
                    System.out.println("Enter Customer Name");
                    String name = scanner.next();
                    System.out.println("No. of booking tickets");
                    Integer bookTickets = scanner.nextInt();

                    totalTicket = totalTicket - bookTickets;
                    System.out.println("Remaing tickets :" + totalTicket);
                    break;

                case 2:

                    System.out.println("");


                    break;

                case 3:
                    System.out.println("Exit");
            }


        } while (totalTicket == 0);


    }
}

