package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.humans;

public class Developer extends Human {

    int numberOfProgrammingLanguages;

    public Developer(int numberOfHair, String gender) {
        super(numberOfHair, gender);
        System.out.println("Wywołanie konstruktora Developer");

    }

    protected void showNumberOfKnownProgrammingLanguages() {
        System.out.println("I know " + numberOfProgrammingLanguages + " languages");
    }

    public void learnLanguage() {
        numberOfProgrammingLanguages++;
    }


}
