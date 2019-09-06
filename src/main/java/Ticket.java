import java.util.Objects;

public class Ticket {

    TicketType ticketType;
  //  private String seatNumber;
    Food food;
    private Flight flight;
    private int price;


   public Ticket(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

  /*  public String getSeatNumber() {
        return seatNumber;
    }*/

    public Food getFood() {
        return food;
    }

   public Flight getFlight() {
        return flight;
    }

    public int getPrice() {
        return price;
    }

    public Ticket(Builder builder) {
        this.ticketType = Objects.requireNonNull(builder.ticketType, "TicketType cannot be null.");
       // this.seatNumber = Objects.requireNonNull(builder.seatNumber, "SeatNumber cannot be null.");
        this.flight = Objects.requireNonNull(builder.flight, "Flight cannot be null.");
        this.food = Objects.requireNonNull(builder.food, "Food cannat be null.");
        this.price = Objects.requireNonNull(builder.price, "Price cannot be null.");
    }
    public String toString(){
        return " \n Ticket information: \n" +
                ""+"the ticket type is: "+ ticketType+"\n" +
                flight+"\n " +
                food+"\n" +
                "the ticket price is: "+price +"\n";
    }

     public static Builder builder(){return new Builder();}

    public static class Builder {
        private TicketType ticketType;
        private Food food;
       // private String seatNumber;
        private Flight flight;
        private int price;


        public Builder withTicketType(TicketType ticketType) {
            this.ticketType = ticketType;
            return this;
        }

        public Builder withFood(Food food) {
            this.food = food;
            return this;
        }

      /*  public Builder withSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }*/

      public Builder withFlight(Flight flight) {
            this.flight = flight;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }

}
