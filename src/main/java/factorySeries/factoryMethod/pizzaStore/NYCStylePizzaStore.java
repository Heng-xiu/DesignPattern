package factorySeries.factoryMethod.pizzaStore;

import factorySeries.Pizza;
import factorySeries.factoryMethod.NYCStylePizzaSimpleFactory;

public class NYCStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return NYCStylePizzaSimpleFactory.getPizza(type);
    }
}
