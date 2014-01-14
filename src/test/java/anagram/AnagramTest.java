package anagram;

import anagram.Anagram;
import org.junit.Assert;
import org.junit.Test;

/**
 * User: Mariola
 * Date: 14.01.14
 */
public class AnagramTest {
    @Test
    public void testIsAnagram() throws Exception {
        Assert.assertTrue(Anagram.isAnagram("  mff   ", "mff"));
        Assert.assertTrue(Anagram.isAnagram("  msc   ", "m   s   c"));
        Assert.assertTrue(Anagram.isAnagram("  maa  ", "aam"));
        Assert.assertTrue(Anagram.isAnagram("m ", "m"));
        Assert.assertTrue(Anagram.isAnagram("m", "m"));

        Assert.assertFalse(Anagram.isAnagram("sadf", "fsdgagadgag"));
        Assert.assertFalse(Anagram.isAnagram(null, null));
        Assert.assertFalse(Anagram.isAnagram("sadf", null));
        Assert.assertFalse(Anagram.isAnagram("", "fsdgagadgag"));
        Assert.assertFalse(Anagram.isAnagram("fjf   ", "fsf fs fseee"));



    }
}
