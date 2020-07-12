package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.vehicles;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle someMachine = new Vehicle(20);
        Helicopter apache = new Helicopter(20);
        Suv someSuv = new Suv(8);
        Car someCar = new Car(8);

        apache.showNumberOfWingblades();
        someSuv.showNumberOfSeats();

        Vehicle[] vehicles = {someMachine, apache};

        for (Vehicle vehicle : vehicles) {
            System.out.println("Horse power is " +
                    vehicle.calculateHorsePower());
        }

        Car[] cars = {someCar, someSuv};
        //Suv[] suvs = {someCar, someSuv};

        someCar.setNumberOfSeats(33);

        for (Car car : cars) {
            car.showNumberOfSeats();
        }
    }
}
