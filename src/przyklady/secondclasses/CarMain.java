package przyklady.secondclasses;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car(123, 4, "Volvo");

        Car secondCar = new Car(432, 5, "Ferrari");

        System.out.println("Predkosc samochodu " + car.getSpeed());
        System.out.println("Liczba drzwi " + car.getNumberOfDoors());


        car.setSpeed(456);
        System.out.println("Predkosc samochodu " + car.getSpeed());

    }
}


