package singleton;

public class Eager {
    /*
     * Eager way to instance the class.
     * Pros: JVM can hold the necessary resources at the beginning. It also leads the performance.
     * Cons: If the class doesn't execute during the process, the memory is wasted.
     *
     * According to Effective Java 2-edition, this method also called "public final field"
     */
    public static final Eager INSTANCE = new Eager();
    private Eager(){
        System.out.println("SingletonEager has been created.");
    }
}
