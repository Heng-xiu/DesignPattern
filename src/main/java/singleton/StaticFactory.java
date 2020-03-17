package singleton;

public class StaticFactory {
    /* [Effective Java item3]
     *
     * StaticFactory
     * Pros: In this method, the API makes it clear that the class is a singleton
     * Cons:
     *
     */
    private static final StaticFactory INSTANCE = new StaticFactory();
    private StaticFactory(){
        System.out.println("Static Factory has been created.");
    }

    public static StaticFactory getInstance(){
        return INSTANCE;
    }
}
