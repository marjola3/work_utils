package silnia.rekurencja;

/**
 * User: Mariola
 * Date: 08.01.14
 */
public class Silnia {

    public static int obliczSilnie(int liczba) {
        if (liczba <= 1) {
            return 1;
        } else {
            return liczba * obliczSilnie(liczba-1);
        }
    }
}