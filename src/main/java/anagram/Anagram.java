package anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Mariola
 * Date: 14.01.14
 */
public class Anagram {
    /**
     * Metoda sprawdza czy podane wyrazy są <b>anagramami</b>
     *
     * @param s1 pierwszy wyraz
     * @param s2 drugi wyraz
     * @return true jeśli wyrazy są anagramami, w przeciwnym
     * wypadku false
     */
    public static boolean isAnagram(String s1, String s2) {
        if(s1 == null || s2 == null) {
            return false;
        }

        String s1BezSpacji = s1.replace(" ", "");
        String s2BezSpacji = s2.replace(" ", "");

        if(s1BezSpacji.length() != s2BezSpacji.length() || s1BezSpacji.length() == 0) {
            return false;
        }

        String s1MaleLitery = s1BezSpacji.toLowerCase();
        String s2MaleLitery = s2BezSpacji.toLowerCase();

        Map<Character, Integer> s1LiteryMap = new HashMap<Character, Integer>();
        Map<Character, Integer> s2LiteryMap = new HashMap<Character, Integer>();


        addToMap(s1MaleLitery, s1LiteryMap);
        addToMap(s2MaleLitery, s2LiteryMap);

        for (Character znak : s1LiteryMap.keySet()) {
            if (s1LiteryMap.get(znak) != s2LiteryMap.get(znak)) {
                return false;
            }
        }

        return true;
    }

    public static void addToMap(String litera, Map<Character, Integer> map) {
        for (int i = 0; i < litera.length(); i++) {
            char znak = litera.charAt(i);
            if (!map.containsKey(znak)){
                map.put(znak, 0);
            }
            map.put(znak, map.get(znak) + 1);
        }
    }
}
