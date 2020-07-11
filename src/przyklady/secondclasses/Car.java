package przyklady.secondclasses;

public class Car {

    //prywatny dostep do danych zabezpiecza przed nieautoryzowanym odczytywaniem i zmiana danych
    private int speed;
    private int numberOfDoors;
    private String name;

    public Car(int speed, int numberOfDoors, String name) {
        this.speed = speed;
        this.numberOfDoors = numberOfDoors;
        this.name = name;
    }

    //metoda pobierajaca dane w sposob ustandaryzowany, tzw. getter
    public int getSpeed() {
        return speed;
    }

    //metoda zapisujaca dane w sposob ustandaryzowany, tzw. settter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
