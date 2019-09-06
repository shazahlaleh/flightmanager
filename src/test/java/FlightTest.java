import org.junit.Assert;
import org.junit.Test;

public class FlightTest {


    @Test
    public void creatFlightTest(){

        Flight flight=new Flight();

        Ticket ticket1=new Ticket(TicketType.economy);
        Ticket ticket2= new Ticket(TicketType.economy);
        Ticket ticket3= new Ticket(TicketType.economy);
        Ticket ticket4= new Ticket(TicketType.economy);
        Ticket ticket5= new Ticket(TicketType.economy);
        Ticket ticket6=new Ticket(TicketType.business);
        Ticket ticket7= new Ticket(TicketType.business);
        Ticket ticket8= new Ticket(TicketType.business);
        Ticket ticket9= new Ticket(TicketType.business);
        Ticket ticket10= new Ticket(TicketType.business);
        Ticket ticketTest= new Ticket(TicketType.economy);
        Ticket ticketTest2= new Ticket(TicketType.business);


        flight.addTicket(ticket1);
        flight.addTicket(ticket2);
        flight.addTicket(ticket3);
        flight.addTicket(ticket4);
        flight.addTicket(ticket5);
        flight.addTicket(ticket6);
        flight.addTicket(ticket7);
        flight.addTicket(ticket8);
        flight.addTicket(ticket9);
        flight.addTicket(ticket10);

         Assert.assertFalse(flight.addTicket(ticketTest2));
         Assert.assertFalse(flight.addTicket(ticketTest));

        System.out.println(flight);

    }
}
