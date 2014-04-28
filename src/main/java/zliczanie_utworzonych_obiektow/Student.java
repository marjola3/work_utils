package zliczanie_utworzonych_obiektow;

/**
 * Created by Mariola on 2014-04-28.
 */
public class Student {
    private int id;

    private String imie;

    private String nazwisko;

    private static int licznik = 0;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        this.id = ++licznik;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public static int getLicznik() {
        return licznik;
    }
}
