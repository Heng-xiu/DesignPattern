package factorySeries.abstractFactory;

import factorySeries.Pizza;

public abstract class PizzaStoreAbstractFactory {
    protected abstract Pizza createPizza(String item);
    public Pizza orderPizza(String item){
        Pizza pizza = createPizza(item);
        System.out.println("Making a " + pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
