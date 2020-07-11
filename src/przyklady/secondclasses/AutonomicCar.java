package przyklady.secondclasses;

public class AutonomicCar extends Car {

    //wymuszony konstruktor, trzeci poziom dziedziczenia po Vehicle
    // AutonomicCar->Car->Vehicle
    public AutonomicCar(int speed, int numberOfDoors, String name) {
        super(speed, numberOfDoors, name);
    }
}
