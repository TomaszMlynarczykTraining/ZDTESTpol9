package przyklady.classes;

public class Person {

    //zmienne obiektowe, ktore charakteryzuja obiekt
    public String firstName;
    public String address;
    public int height;

    //konstruktor, czyli jak bedziemy tworzyc obiekty
    public Person(String firstName, int height) {
        this.firstName = firstName;
        this.height = height;
    }

    //metoda, czyli zachowanie danego obiektu, przetwarzanie danych
    public int calculateHeightInMeters(int height) {
        return height / 100;
    }
}
