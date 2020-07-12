package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.animals;

public class Cat extends DomesticAnimal {

    private int numberOfLives = 9;


    Cat(String race, String gender) {
        super(race, gender);
    }

    public void makeSound() {
        System.out.println("Miau!");
    }


    public int getNumberOfLives() {
        return numberOfLives;
    }
}
