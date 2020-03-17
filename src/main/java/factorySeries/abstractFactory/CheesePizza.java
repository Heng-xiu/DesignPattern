package factorySeries.abstractFactory;

import factorySeries.Pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        super.prepare();
        this.setDough(pizzaIngredientFactory.createDough());
        System.out.println("Add =>"+dough);
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
                "dough='" + dough + '\'' +
                '}';
    }
}
