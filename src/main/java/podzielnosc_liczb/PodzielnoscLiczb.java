package podzielnosc_liczb;

/**
 * User: Mariola
 * Date: 08.01.14
 */
public class PodzielnoscLiczb {

    public static boolean sprawdzPodzielnoscLiczby(int dzielna, int dzielnik) {
        if(dzielnik == 0){
            return false;
        }

        if(dzielna % dzielnik == 0){
            return true;
        } else{
            return false;
        }
    }
}
