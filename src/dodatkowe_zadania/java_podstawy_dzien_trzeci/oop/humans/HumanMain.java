package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.humans;

public class HumanMain {

    public static void main(String[] args) {
        Human male = new Human(123, "male");
        Developer female = new Developer(245, "female");
        JavaDeveloper javaDev = new JavaDeveloper(200, "male");

        male.loseHair(23);

        female.learnLanguage();
        female.learnLanguage();

        female.showNumberOfKnownProgrammingLanguages();


        javaDev.loseHair(23, 5);
        javaDev.showNumberOfKnownProgrammingLanguages();
    }
}
