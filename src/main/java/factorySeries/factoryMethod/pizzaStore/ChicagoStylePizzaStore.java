package factorySeries.factoryMethod.pizzaStore;

import factorySeries.Pizza;
import factorySeries.factoryMethod.ChicagoStylePizzaSimpleFactory;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return ChicagoStylePizzaSimpleFactory.getPizza(type);
    }
}
