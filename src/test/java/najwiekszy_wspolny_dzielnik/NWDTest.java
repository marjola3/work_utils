package najwiekszy_wspolny_dzielnik;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Mariola
 * Date: 20.01.14
 */
public class NWDTest {
    @Test
    public void testObliczNWD() throws Exception {

        Assert.assertEquals(50, NWD.obliczNWD(100, 50));
        Assert.assertEquals(2, NWD.obliczNWD(20, 14));
        Assert.assertEquals(3, NWD.obliczNWD(39, 9));
        Assert.assertEquals(-1, NWD.obliczNWD(-39, 9));
        Assert.assertEquals(-1, NWD.obliczNWD(0, 9));
        Assert.assertEquals(-1, NWD.obliczNWD(0, 0));

        Assert.assertNotEquals(3, NWD.obliczNWD(7, 4));
        Assert.assertNotEquals(17, NWD.obliczNWD(237, 86));
        Assert.assertNotEquals(11, NWD.obliczNWD(68, 40));
        Assert.assertNotEquals(19, NWD.obliczNWD(77, 24));
        Assert.assertNotEquals(13, NWD.obliczNWD(8, 4));
    }
}
