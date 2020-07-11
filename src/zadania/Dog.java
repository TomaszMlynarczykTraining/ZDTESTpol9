package zadania;


/*Stwórz klasę Dog.
        a) Dodaj atrybuty rasa, wiek, płeć
        b) Dodaj metody umożliwiające ustawienie wieku oraz pobranie wieku (getAge, setAge)
        c) Dodaj konstruktor, który przyjmie wartości dla rasy i płci, a wiek ustawi na 0
        d) Dodaj metodę powodująca wypisanie na ekran dźwięku wydawanego przez psa
        „Woof!”*/


public class Dog {

    private String race;
    private int age;
    private String gender;

    public Dog(String race, String gender) {
        this.race = race;
        this.gender = gender;
        this.age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}
