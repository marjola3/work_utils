package zmiana_nazwy.dao;

import java.util.ResourceBundle;

/**
 * User: Mariola
 * Date: 07.02.14
 */
public class TextsDao {
    public static String getText(String name){
        ResourceBundle rb = ResourceBundle.getBundle("paths");
        return rb.getString(name);
    }
}
