import java.util.Scanner;

public class TicketBooking2 {


 static int  totalTicket = 100;
   String customerName;
  int numberOFBookTickets;

    public TicketBooking2(String customerName, int numberOFBookTickets) {
        this.customerName = customerName;
        this.numberOFBookTickets = numberOFBookTickets;
totalTicket=numberOFBookTickets;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Ticket Booking System");
        for (int i =0; i<10;i++) {

            System.out.println("Enter Customer Name");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("numberOFBookTickets");
            int numberBookinTicket = scanner.nextInt();
            if (totalTicket>=numberBookinTicket){
                System.out.println(name + " successfully booked ticket " + numberBookinTicket );
                totalTicket = totalTicket - numberBookinTicket;
            }
            if (numberBookinTicket>totalTicket){
                System.out.println("less tickets available");
            }
            System.out.println("available ticket " + totalTicket);
if (totalTicket==0){
    System.out.println("tickets Sold out ");
    break;
}


        }




    }


}
