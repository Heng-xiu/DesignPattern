package factorySeries.simpleFactory;

import factorySeries.CheesePizza;
import factorySeries.GreekPizza;
import factorySeries.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class PizzaSimpleFactoryTest {
    @Test
    public void testPizzaCanBeInstance(){
        Pizza pizza1 = new CheesePizza();
        Pizza pizza2 = new GreekPizza();
        Assert.assertNotNull(pizza1);
        Assert.assertNotEquals(pizza1, pizza2);
    }

    @Test
    public void testSimplePizzaFactory(){
        Pizza cheesePizza = PizzaSimpleFactory.getPizza("CheesePizza");
        Pizza greekPizza = PizzaSimpleFactory.getPizza("GreekPizza");
        Assert.assertNotNull(cheesePizza);
        Assert.assertNotNull(greekPizza);
        Assert.assertNotEquals(cheesePizza, greekPizza);
    }
}