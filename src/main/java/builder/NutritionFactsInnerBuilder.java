package builder;

public class NutritionFactsInnerBuilder {
    /*
     * In Effective Java 3rd edition, it clearly say when you can apply builder design pattern in the program.
     * At the end of the item3,"the builder pattern is a good choice when designing classes whose constructors or
     * static factory would have more than a handful of parameters".
     *
     * In other words, The builder pattern simulates named optional parameters.
     * Compared with JavaBean pattern, set/method, it will change the state of the class, which violate item 17.
     *
     *
     * */
    private final String name;
    private final int calories;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        //Required
        private String name;
        //optional
        private int calories = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(String name){
            this.name = name;
        }

        public Builder calories(int value){
            calories = value;
            return this;
        }
        public Builder sodium(int value){
            sodium = value;
            return this;
        }
        public Builder carbohydrate(int value){
            carbohydrate = value;
            return this;
        }
        public NutritionFactsInnerBuilder build(){
            return new NutritionFactsInnerBuilder(this);
        }

    }

    private NutritionFactsInnerBuilder(Builder builder){
        name = builder.name;
        calories = builder.calories;
        carbohydrate = builder.carbohydrate;
        sodium = builder.sodium;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
