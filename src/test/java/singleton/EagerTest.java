package singleton;

import org.junit.Assert;
import org.junit.Test;

public class EagerTest {
    @Test
    public void testInstancesEqual() {
        Eager instance1 = Eager.INSTANCE;
        Eager instance2 = Eager.INSTANCE;
        Assert.assertEquals(instance1, instance2);
    }
}