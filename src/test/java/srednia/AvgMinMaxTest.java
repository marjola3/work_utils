package srednia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Mariola
 * Date: 24.01.14
 */
public class AvgMinMaxTest {
    private AvgMinMax avgMinMax;

    @Before
    public void setUp() throws Exception {
        avgMinMax = new AvgMinMax();
    }

    @After
    public void tearDown() throws Exception {
        avgMinMax = null;
    }

    @Test
    public void testMin() throws Exception {
        double[] numbers1 = {2.9, 3.5, 4.5, -2.5, 0.0};
        double[] numbers2 = {45.0};

        assertEquals(-2.5, avgMinMax.min(numbers1));
        assertEquals(45.0, avgMinMax.min(numbers2));
    }

    @Test
    public void testMax() throws Exception {

    }

    @Test
    public void testAvg() throws Exception {

    }

    @Test(expected = NullArgumentException.class)
    public void testNullArgumentMin() throws NullArgumentException, EmptyArrayException {
        avgMinMax.min(null);
    }

    @Test(expected = EmptyArrayException.class)
    public void testEmptyArgumentMin() throws NullArgumentException, EmptyArrayException {
        avgMinMax.min(new double[]{});
    }
}
