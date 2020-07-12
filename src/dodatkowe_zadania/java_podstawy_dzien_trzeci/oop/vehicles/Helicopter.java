package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.vehicles;

public class Helicopter extends Vehicle {

    private int numberOfWingblades;

    public Helicopter(int horsePower) {
        super(horsePower);
    }

    public void showNumberOfWingblades() {
        System.out.println(numberOfWingblades);
    }

    @Override
    protected int calculateHorsePower() {
        return horsePower / 5;
    }
}
