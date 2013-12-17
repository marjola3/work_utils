package palindrom;

/**
 * Author: Mariola
 * Date: 17.12.13
 */

public class Palindrom {

    public boolean isPalindrom(String pierwszy, String drugi) {
        if(pierwszy == null || drugi == null)
            return false;

        if(pierwszy.equals("") || drugi.equals(""))
            return false;

        if (pierwszy.length() != drugi.length())
            return false;

        String pierwszyZMalych = pierwszy.toLowerCase();
        String drugiZMalych = drugi.toLowerCase();

        for (int i = 0; i < pierwszyZMalych.length(); i++) {
            if (pierwszyZMalych.charAt(i) != drugiZMalych.charAt(drugiZMalych.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}