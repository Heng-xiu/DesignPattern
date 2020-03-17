package singleton;

public class LazyLoading {

    private static LazyLoading INSTANCE = null;
    private LazyLoading(){
        System.out.println("LazyLoading Class has been created");
    }

    public static LazyLoading getInstance(){
        if (INSTANCE == null){
            INSTANCE = new LazyLoading();
        }
        return INSTANCE;
    }
}
