import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MenuTest {

    @Test
    public void addFoodItemTest(){

        Food food1=new Food("pizza",50);
        Food food2=new Food("beer",40);
        Food food3=new Food("tea",10);
        Food food4=new Food("sandwish",25);
        Food food5=new Food("coffee",30);
        List<Food> listEconomy=new ArrayList<>();

        Menu menuEconomy=new Menu(TicketType.economy,listEconomy);
        menuEconomy.addFoodItem(food1);
        menuEconomy.addFoodItem(food2);
        menuEconomy.addFoodItem(food3);
        menuEconomy.addFoodItem(food4);
        menuEconomy.addFoodItem(food5);

        Assert.assertFalse(menuEconomy.listFood.isEmpty());

        System.out.println(menuEconomy.listFood);
    }

    @Test
    public void removeFoodItemTest(){
        Food food1=new Food("pizza",50);
        Food food2=new Food("Tea",15);
        Food food3=new Food("coffee",30);

        List<Food> foodList = new ArrayList<>();

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);

        Menu testMenu =new Menu(TicketType.business,foodList);
        testMenu.removeFoodItem("Tea");
        Assert.assertFalse(testMenu.listFood.size()==3);
        System.out.println(testMenu.listFood);

    }
    @Test
    public void toStringTest(){
        Food food = new Food("pizza", 50);
        Food food1 =new Food("coffee" , 20);
        Food food2= new Food("sandwish" ,30);
        Food food3= new Food("bear",60);

        Food food4= new Food("lobster", 600);
        Food food5= new Food("champagne" ,400);
        Food food6=new Food("expresso", 200);
        Food food7= new Food("smörgåstårta", 300);

        List<Food> cheapList =new ArrayList<>();
        List<Food> classyList= new ArrayList<>();

        cheapList.add(food);
        cheapList.add(food1);
        cheapList.add(food2);
        cheapList.add(food3);

        classyList.add(food4);
        classyList.add(food5);
        classyList.add(food6);
        classyList.add(food7);

        Menu cheapMenu= new Menu(TicketType.economy,cheapList);
        Menu classyMenu=new Menu(TicketType.business,classyList);

        System.out.println(cheapMenu.toString());
        System.out.println(classyMenu.toString());



    }


}
