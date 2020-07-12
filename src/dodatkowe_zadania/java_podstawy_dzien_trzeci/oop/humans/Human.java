package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.humans;

public class Human {

    protected int numberOfHair;
    private String gender;


    public Human(int numberOfHair, String gender) {
        this.numberOfHair = numberOfHair;
        this.gender = gender;
        System.out.println("Wywołanie konstruktora Human");
    }

    public void loseHair(int numberOfLostHair) {
        if (this.numberOfHair > 0) {
            this.numberOfHair -= numberOfLostHair;
            System.out.println("Object of type human have " +
                    this.getNumberOfHair());

        }
    }

    protected String getGender() {
        return gender;
    }

    public int getNumberOfHair() {
        return numberOfHair;
    }


}
