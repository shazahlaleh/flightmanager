import org.junit.Assert;
import org.junit.Test;

public class FoodTest {

    @Test
    public void createFood(){
        Food food1= new Food("pizza" ,100);
        Assert.assertEquals("pizza",food1.getName());
        System.out.println(food1);
    }
}
