package builder;

import org.junit.Test;

public class NutritionFactsInnerBuilderTest {
    @Test
    public void testBuilder(){
        NutritionFactsInnerBuilder colaNutritionFacts = new NutritionFactsInnerBuilder
                .Builder("Cola")
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
        System.out.println(colaNutritionFacts.toString());
    }

}