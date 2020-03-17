package factorySeries.factoryMethod.pizzaStore;

import factorySeries.Pizza;

public abstract class PizzaStore {
    /*
     * In the factory method, the most important thing is that we move instance to the sub class.
     * We keep abstract method in super class, and allow sub class decide which class should be instance.
     *
     * Take PizzaStore as example, we do not know which pizza would be instance. So, we abstract a method called
     * createPizza. Make the program decouple and stay with hierarchy.
     *
     * Make createPizza abstract is the key thing in Factory Method.
     */

    //This method follow by Factory Method
    abstract Pizza createPizza(String type);
    //This method is the original method in Class PizzaStore
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("Making a " + pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

}
