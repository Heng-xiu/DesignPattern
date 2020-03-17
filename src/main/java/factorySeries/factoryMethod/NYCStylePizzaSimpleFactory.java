package factorySeries.factoryMethod;

import factorySeries.Pizza;

import java.util.HashMap;
import java.util.Map;

public class NYCStylePizzaSimpleFactory {
    private static Map<String, Pizza> extractors = new HashMap<>();
    static {
        extractors.put("CheesePizza", new NYCCheesePizza());
        extractors.put("GreekPizza", new NYCGreekPizza());
    }

    public static Pizza getPizza(String type){
        return extractors.get(type);
    }
}
