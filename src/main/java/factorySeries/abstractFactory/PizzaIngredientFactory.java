package factorySeries.abstractFactory;

public interface PizzaIngredientFactory {
    String createDough();
    void createSauce();
    void createCheese();
    void createVeggies();
    void createPepperoni();
    void createClam();
}
