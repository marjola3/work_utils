package srednia;

/**
 * User: Mariola
 * Date: 24.01.14
 */
public class NullArgumentException extends Exception{
    public NullArgumentException(){
        super();
    }

    public NullArgumentException(String message){
        super(message);
    }
}
