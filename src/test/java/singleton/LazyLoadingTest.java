package singleton;

import org.junit.Assert;
import org.junit.Test;

public class LazyLoadingTest {
    @Test
    public void testLazyLoading(){
        LazyLoading instance1 = LazyLoading.getInstance();
        LazyLoading instance2 = LazyLoading.getInstance();
        Assert.assertEquals(instance1, instance2);
    }
}