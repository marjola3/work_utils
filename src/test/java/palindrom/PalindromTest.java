package palindrom;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: Mariola
 * Date: 17.12.13
 */

public class PalindromTest {
    @Test
    public void testIsPalindrom() throws Exception {
        Palindrom palindrom = new Palindrom();

        Assert.assertFalse(palindrom.isPalindrom(null, null));
        Assert.assertFalse(palindrom.isPalindrom(null, ""));
        Assert.assertFalse(palindrom.isPalindrom("", null));
        Assert.assertFalse(palindrom.isPalindrom("", ""));
        Assert.assertFalse(palindrom.isPalindrom("Kajak", "Alt"));
        Assert.assertFalse(palindrom.isPalindrom("ropucha", null));
        Assert.assertFalse(palindrom.isPalindrom("ropucha", ""));

        Assert.assertTrue(palindrom.isPalindrom("kajak", "kajak"));
        Assert.assertTrue(palindrom.isPalindrom("Kajak", "kajak"));
        Assert.assertTrue(palindrom.isPalindrom("aga", "Aga"));
        Assert.assertTrue(palindrom.isPalindrom("oko", "OKO"));
        Assert.assertTrue(palindrom.isPalindrom("SAS", "sas"));
        Assert.assertTrue(palindrom.isPalindrom("Sas", "saS"));
    }
}
