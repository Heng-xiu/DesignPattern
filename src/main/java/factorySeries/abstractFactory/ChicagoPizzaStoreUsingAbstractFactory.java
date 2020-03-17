package factorySeries.abstractFactory;

import factorySeries.Pizza;

import java.util.HashMap;
import java.util.Map;

public class ChicagoPizzaStoreUsingAbstractFactory extends PizzaStoreAbstractFactory {
    @Override
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Map<String, Pizza> extractors = new HashMap<>();

        extractors.put("CheesePizza", new CheesePizza(ingredientFactory));
        extractors.put("GreekPizza", new GreekPizza(ingredientFactory));

        return extractors.get(item);
    }
}
