package przyklady.secondclasses;

public class Car extends Vehicle {

    //prywatny dostep do danych zabezpiecza przed nieautoryzowanym odczytywaniem i zmiana danych
    private int numberOfDoors;


    public Car(int speed, int numberOfDoors, String name) {
        //parametr odziedziczony po Vehicle
        this.speed = speed;
        this.numberOfDoors = numberOfDoors;
        this.name = name;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
