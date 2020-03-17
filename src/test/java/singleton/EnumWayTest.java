package singleton;

import org.junit.Assert;
import org.junit.Test;

public class EnumWayTest {
    @Test
    public void testEnumClass(){
        EnumWay instance1 = EnumWay.INSTANCE;
        EnumWay instance2 = EnumWay.INSTANCE;
        Assert.assertEquals(instance1, instance2);
    }
}