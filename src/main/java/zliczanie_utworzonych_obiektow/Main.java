package zliczanie_utworzonych_obiektow;

/**
 * Created by Mariola on 2014-04-28.
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ola", "Kowalska");
        Student student2 = new Student("Kasia", "Nowak");
        Student student3 = new Student("Jola", "Malinowska");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        int iloscObiektow = Student.getLicznik();
        System.out.println("Utworzonych obiektow: " + iloscObiektow );
    }
}
