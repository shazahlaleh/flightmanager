import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
    TicketType ticketType;
   // List<Food> businessMenu=new ArrayList<Food>();
  //  List<Food> economyMenu=new ArrayList<Food>();
    List<Food> listFood;

    public Menu(){}

    public Menu(TicketType ticketType, List<Food> listFood){
        this.ticketType=ticketType;
        this.listFood=listFood;
    }
    public void addFoodItem(Food food){
        listFood.add(food);
    }
    public void removeFoodItem(String foodName){
        Iterator<Food> iterator=listFood.iterator();
        while (iterator.hasNext()){
            Food food = iterator.next();
            if (food.getName().equals(foodName))
                listFood.remove(food);

        }
    }

    public String toString(){
        String outPut ="";
        for (Food food : listFood)
            outPut += food.toString();

        String typeMenu = ticketType.equals(TicketType.economy)? "cheapMenu" : "classyMenu";
        return  typeMenu + "\n" + outPut;
    }





}
