package factorySeries.simpleFactory;

import factorySeries.CheesePizza;
import factorySeries.GreekPizza;
import factorySeries.Pizza;

import java.util.HashMap;
import java.util.Map;

public class PizzaSimpleFactory {
    /*
     * Remember, remember, remember. Any factory methods have been mentioned in DP are doing one thing.
     * Create class without exposed implementation. For the client side, client all need to know is the given parameter.
     * In addition, we can simply the procedure as below: y = Factory(X).
     *
     * The simpleFactory is almost like if-else or switch-case. Yet, the spirit is focus on the client side.
     * Client need to know the given parameter, like a menu in real world.
     * Pros: client doesn't care about the creation of the class.
     * Cons: if we want to add new class, it violate open-close principle.
     *
     */
    private static Map<String, Pizza> extractors = new HashMap<>();
    static {
        extractors.put("CheesePizza", new CheesePizza());
        extractors.put("GreekPizza", new GreekPizza());
    }

    public static Pizza getPizza(String type){
        return extractors.get(type);
    }
}
