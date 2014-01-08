package podzielnosc_liczb;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Mariola
 * Date: 08.01.14
 */
public class PodzielnoscLiczbTest {
    @Test
    public void testSprawdzPodzielnoscLiczby() throws Exception {

        Assert.assertTrue(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(15,5));
        Assert.assertTrue(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(10,2));
        Assert.assertTrue(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(3,3));
        Assert.assertTrue(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(1,1));
        Assert.assertTrue(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(1500,100));

        Assert.assertFalse(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(15,4));
        Assert.assertFalse(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(150,7));
        Assert.assertFalse(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(41,11));
        Assert.assertFalse(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(0,0));
        Assert.assertTrue(PodzielnoscLiczb.sprawdzPodzielnoscLiczby(20,5));
    }
}
