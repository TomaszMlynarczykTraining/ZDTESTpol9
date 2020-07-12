package dodatkowe_zadania.java_podstawy_dzień_czwarty.animals;

public class Dog extends DomesticAnimal {

    private int numberOfBorks;
    private Muzzle muzzle;

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

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "numberOfBorks=" + numberOfBorks +
                ", muzzle=" + muzzle +
                '}';
    }
}
