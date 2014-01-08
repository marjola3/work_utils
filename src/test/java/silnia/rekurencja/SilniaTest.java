package silnia.rekurencja;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Mariola
 * Date: 08.01.14
 */
public class SilniaTest {
    @Test
    public void testObliczSilnie() throws Exception {

        Assert.assertEquals(120, Silnia.obliczSilnie(5));
        Assert.assertEquals(1, Silnia.obliczSilnie(1));
        Assert.assertEquals(1, Silnia.obliczSilnie(0));
        Assert.assertEquals(2, Silnia.obliczSilnie(2));
        Assert.assertEquals(6, Silnia.obliczSilnie(3));
        Assert.assertEquals(3628800, Silnia.obliczSilnie(10));

        Assert.assertNotEquals(56, Silnia.obliczSilnie(10));
    }
}
