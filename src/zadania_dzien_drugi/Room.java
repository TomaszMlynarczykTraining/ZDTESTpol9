package zadania_dzien_drugi;


//wygenerowanie konstruktora - prawy przycisk myszy ->generate -> constructor ->wybranie paraemtrów
public class Room {

    //parametry charakteryzujace klase, a.)
    private double height;
    private double width;
    private double length;

    //konstruktor ze wszystkimi parametrami b.)
    public Room(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    //konstruktor z wartością domyślną, c.)
    public Room(double width, double length) {
        this.width = width;
        this.length = length;
        this.height = 2.4;
    }

    //metoda publiczna zwracajca objetosc zgodnie ze wzorem, na podstawie stanu obiektu
    public double calculateVolume() {
        return width * height * length;
    }

    //metoda publiczna zwracajca powierchnia zgodnie ze wzorem, na podstawie stanu obiektu
    public double calculateSurface() {
        return 2 * width * height + 2 * height * width + 2 * width * length;
    }

    //metoda wyswietlajaca objetosc uzywajaca innej metody z tej klasy
    public void showVolume() {
        System.out.println("Objetosc pokoju to:" + calculateVolume());
    }

    //metoda wyswietlajaca powierzchnie uzywajaca innej metody z tej klasy
    public void showSurface() {
        System.out.println("Powierzchnia pokoju to:" + calculateSurface());
    }
}
