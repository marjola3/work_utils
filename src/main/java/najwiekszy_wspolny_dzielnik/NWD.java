package najwiekszy_wspolny_dzielnik;

/**
 * User: Mariola
 * Date: 20.01.14
 */
public class NWD {
    public static int obliczNWD(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}
