package factorySeries.abstractFactory;

public class NYCPizzaIngredientFactory implements PizzaIngredientFactory {
    public NYCPizzaIngredientFactory() {
    }

    @Override
    public String createDough() {
        return "NYCDough";
    }

    @Override
    public void createSauce() {

    }

    @Override
    public void createCheese() {

    }

    @Override
    public void createVeggies() {

    }

    @Override
    public void createPepperoni() {

    }

    @Override
    public void createClam() {

    }
}
