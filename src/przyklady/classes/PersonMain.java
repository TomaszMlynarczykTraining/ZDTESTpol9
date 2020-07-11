package przyklady.classes;

public class PersonMain {

    public static void main(String[] args) {

        //tworzenie obiektow na podstawie szablonu (klasy)
        Person firstPerson = new Person("Tomasz", 29);
        Person secondPerson = new Person("Aga", 23);
        Person thirdPerson = new Person("Aga", 23);


        //dobieranie sie do parametrow klasy
        System.out.println(firstPerson.firstName);
        System.out.println(firstPerson.height);

        System.out.println(firstPerson.calculateHeightInMeters(194));

    }
}
