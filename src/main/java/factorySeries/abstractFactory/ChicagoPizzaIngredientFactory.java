package factorySeries.abstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "ChicagoDough";
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
