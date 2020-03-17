package factorySeries.factoryMethod.pizzaStore;

import factorySeries.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {
    /*
     * The factory method pattern defines an interface for creating an object, but lets subclasses decide which class
     * to instantiate. Factory method lets a class defer instantiation to subclasses.
     *
     */
    @Test
    public void testFactoryMethod(){
        PizzaStore chicagoStyleStore = new ChicagoStylePizzaStore();
        PizzaStore nycStyleStore = new NYCStylePizzaStore();
        Pizza chicagoCheesePizza = chicagoStyleStore.orderPizza("CheesePizza");
        Pizza nycCheesePizza = nycStyleStore.orderPizza("CheesePizza");

        Assert.assertNotEquals(chicagoCheesePizza, nycCheesePizza);
    }

}