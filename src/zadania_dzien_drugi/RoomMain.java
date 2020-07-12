package zadania_dzien_drugi;


/*Stwórz klasę Room.
        a) Dodaj atrybuty wysokość, szerokość, długość (typu double).
        b) Dodaj konstruktor, który przyjmie wszystkie wartości.
        c) Dodaj drugi konstruktor, który przyjmie szerokość i długość a wysokość ustawi na 2,4.
        d) Dodaj metody obliczające oraz zwracające pole powierzchni oraz objętość pokoju.
        e) Dodaj metody wyświetlające pole powierzchni oraz objętość pokoju.
        f) Z poziomu metody main zaprezentuj działanie poszczególnych metod.
        g) Stwórz tablicę obiektów typu pokój. Wyświetl ich parametry.*/

public class RoomMain {

    public static void main(String[] args) {

        //tworzenie obiektu z konstruktora z podpunktu b.)
        Room livingRoom = new Room(2.4, 3.5, 3.2);
        //tworzenie obiektu z konstruktora z podpunktu C.)
        Room kitchen = new Room(2.5, 2.2);

        //tworzenie listy pokojów na podstawie utworzonego przez nas typu
        Room[] listOfRooms = {livingRoom, kitchen};


        //wywołanie metod dla każdego z pokojów
        for (Room room : listOfRooms) {
            room.showSurface();
            room.showVolume();
        }

        //wykorzystanie gettera i settera
        livingRoom.setLength(42.3);

        System.out.println("Dlugosc po zmianie to " + livingRoom.getLength());
    }
}
