package factorySeries.abstractFactory;

import factorySeries.Pizza;

public class GreekPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public GreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.setDough(pizzaIngredientFactory.createDough());
    }
}
