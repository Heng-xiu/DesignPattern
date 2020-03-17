package singleton;

public enum EnumWay {
    INSTANCE;

    /*
     * This method provides the serialization machinery for free and provides an ironclad guarantee against
     * multiple instantiation.
     *
     * According to Effective Java 2-edition, this method is the preferred approach to implement Singleton
     * Design pattern.
     */
    EnumWay(){
        System.out.println("Enum class has been created.");
    }
}