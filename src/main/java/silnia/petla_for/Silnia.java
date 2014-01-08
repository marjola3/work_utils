package silnia.petla_for;

/**
 * User: Mariola
 * Date: 08.01.14
 */
public class Silnia {

    public static int obliczSilnie(int liczba) {
        int wynikSilni = 1;

        for (int i = 1; i <= liczba; i++) {
            wynikSilni *= i;
        }

        return wynikSilni;
    }
}
