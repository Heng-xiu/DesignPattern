package adapter;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LittleRedHoodTest {
    private static IHuman grandMa;
    private static IHuman littleRedHood;
    private static IBeat woof;
    private static IHuman fakeGrandMa;

    @BeforeClass
    public static void setup() {
        System.out.println("startup - littleRedHoodTest");
        grandMa = new GrandMa();
        littleRedHood = new LittleRedHood();
        woof = new Wolf();
    }

    @Test
    public void testGrandMa(){
        Assert.assertNotNull(grandMa);
        Assert.assertEquals(grandMa.makeHumanSound(), "Hello LittleRedHood");
    }

    @Test
    public void testWoof(){
        Assert.assertNotNull(woof);
        Assert.assertEquals(woof.makeSound(), "Ohhhhhhh");
    }

    @Test
    public void testWoofMeetsLittleRedHood(){
        System.out.println("Little red hood meets grandMa");
        System.out.println(littleRedHood.makeHumanSound());
        System.out.println(grandMa.makeHumanSound());
        Assert.assertEquals(grandMa.makeHumanSound(), "Hello LittleRedHood");

        System.out.println(" === Few moment later === ");
        System.out.println(littleRedHood.makeHumanSound());
        fakeGrandMa = new GrandMaAdapter(woof);
        System.out.println(fakeGrandMa.makeHumanSound());
        Assert.assertEquals(fakeGrandMa.makeHumanSound(), grandMa.makeHumanSound());
        System.out.println("Say goodbye to little red hood.");
    }
}