import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {

   /* flightManger1
    private String name;

    public Flight(String name)
    {
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "the flight name is : "+ name +"\n";
    }
*/

     private final int  numberOfSeats = 10;
     Map<Integer,Ticket> seats =new HashMap<>(numberOfSeats);

     public Flight(){

     }

     public Map<Integer,Ticket> getSeats(){return seats;}

     public int businessSeatIsAvailable(){
         for(int i=1; i <= 5;i++) {
             if (!seats.containsKey(i)){
                 return i;
             }
         }
             return 0;

         }

     public int economySeatIsAvailable(){
    for (int i=6 ;i<=10;i++) {
        if (!seats.containsKey(i)) {
            return i;
        }
    }
        return 0;
    }
    public boolean addTicket(Ticket ticket){
         if (ticket.ticketType==TicketType.economy && economySeatIsAvailable()>0){
             seats.put(economySeatIsAvailable(),ticket);
         return true;}
         if (ticket.ticketType==TicketType.business && businessSeatIsAvailable()>0){
             seats.put(businessSeatIsAvailable(),ticket);
             return true;}
         return false;
    }

    @Override
    public String toString() {


         return "Flight \n" +
                "numberOfSeats=" + numberOfSeats +"\n"+
                 "the seat Number is: " + seats +
                '}';
    }
}



