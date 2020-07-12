package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop.animals;

public class DogMain {

    public static void main(String[] args) {
        Dog border = new Dog("Border-Collie", "male");
/*        int someNumber = 3;
        Integer someNumber2 = new Integer(3);*/

        Dog amstaf = new Dog("Amstaf", "female");

        Dog[] dogs = {border, amstaf};

        border.setAge(3);
/*        for (Dog dog : dogs) {
            System.out.println("Dog is " + dog.getAge() + " years old");
        }*/

        Cat pershian = new Cat("Pershian", "female");
        Cat maikun = new Cat("Maikun", "female");


        DomesticAnimal[] domesticAnimals = {amstaf, border, pershian, maikun};

        for (DomesticAnimal animal : domesticAnimals) {
            animal.makeSound();
        }

        System.out.println("This cat has " + pershian.getNumberOfLives() + " lives");

        border.makeSound();

        System.out.println("Border borked " + border.getNumberOfBorks() + " times.");
    }
}
