package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.animals;

public class Dog extends DomesticAnimal {

    private int numberOfBorks;

    Dog(String race, String gender) {
        super(race, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Bork");
        numberOfBorks++;
    }

    public int getNumberOfBorks() {
        return numberOfBorks;
    }
}
