package factorySeries.abstractFactory;

import factorySeries.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory(){
        PizzaStoreAbstractFactory chicagoStyleStoreUsingAbstractFactory = new ChicagoPizzaStoreUsingAbstractFactory();
        PizzaStoreAbstractFactory nycStyleStoreUsingAbstractFactory = new NYCPizzaStoreAbstractFactoryUsingAbstractFactory();

        Pizza CheesePizza_1 = chicagoStyleStoreUsingAbstractFactory.orderPizza("CheesePizza");
        Pizza CheesePizza_2 = nycStyleStoreUsingAbstractFactory.orderPizza("CheesePizza");

        Assert.assertNotEquals(CheesePizza_1, CheesePizza_2);
    }

}