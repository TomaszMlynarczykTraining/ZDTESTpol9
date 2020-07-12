package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.vehicles;

public class Vehicle {

    protected int numberOfDoors;

    protected int horsePower;
    private boolean isMoving;

    public Vehicle(int horsePower) {
        this.horsePower = horsePower;
    }

    public Vehicle() {
    }

    protected void showNumberOfDoors() {
        System.out.println(numberOfDoors);
    }

    protected int calculateHorsePower() {
        return horsePower * 5;
    }


    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
