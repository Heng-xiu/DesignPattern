package singleton;

import org.junit.Assert;
import org.junit.Test;

public class StaticFactoryTest {
    @Test
    public void testStaticFactory(){
        StaticFactory instance1 = StaticFactory.getInstance();
        StaticFactory instance2 = StaticFactory.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        Assert.assertEquals(instance1, instance2);
    }
}