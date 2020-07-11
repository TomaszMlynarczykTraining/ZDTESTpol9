package zadania;

public class DogMain {

    public static void main(String[] args) {

        Dog germanShepard = new Dog("German Shepard", "male");

        System.out.println(germanShepard.getAge());

        germanShepard.setAge(10);
        System.out.println(germanShepard.getAge());

        germanShepard.makeSound();

        Dog york = new Dog("York", "female");

        york.makeSound();

        germanShepard.makeSoundDependingOnAge();
        york.makeSoundDependingOnAge();

    }
}
