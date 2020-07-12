package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.humans;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(int numberOfHair, String gender) {
        super(numberOfHair, gender);
        numberOfProgrammingLanguages++;
        System.out.println("Wywołanie konstruktora JavaDeveloper");
    }


    public void praiseJava() {
        System.out.println("My gender is " + getGender());
        System.out.println("Java is the best!");
    }

    public void loseHair(int lostHair, int yearsOfExperience) {
        if (yearsOfExperience > 4) {
            System.out.println("I already lost all hair due to stress");
            numberOfHair = 0;
        } else {
            numberOfHair -= lostHair;
        }
    }
}
