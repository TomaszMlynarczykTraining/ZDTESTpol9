package dodatkowe_zadania.java_podstawy_dzień_czwarty.animals;

abstract public class DomesticAnimal {

    private String race;
    private int age;
    private String gender;


    DomesticAnimal(String race, String gender) {
        this.race = race;
        this.gender = gender;
        this.age = 0;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void makeSound();
}


