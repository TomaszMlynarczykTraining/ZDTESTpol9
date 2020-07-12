package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.vehicles;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String type;

    public Car(int horsePower) {
        super(horsePower);
    }

    public void showNumberOfSeats() {
        System.out.println(numberOfSeats);
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
