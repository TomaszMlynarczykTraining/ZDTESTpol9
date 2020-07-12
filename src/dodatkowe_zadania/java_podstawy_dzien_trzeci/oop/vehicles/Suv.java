package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.vehicles;

public class Suv extends Car {

    private String typeOfSuspension;

    public Suv(int horsePower) {
        super(horsePower);
    }

    public void showTypeOfSuspension() {
        System.out.println(typeOfSuspension);
    }
}
