package factorySeries.factoryMethod;

import factorySeries.Pizza;

import java.util.HashMap;
import java.util.Map;

public class ChicagoStylePizzaSimpleFactory {
    private static Map<String, Pizza> extractors = new HashMap<>();
    static {
        extractors.put("CheesePizza", new ChicagoCheesePizza());
        extractors.put("GreekPizza", new ChicagoGreekPizza());
    }

    public static Pizza getPizza(String type){
        return extractors.get(type);
    }

}
