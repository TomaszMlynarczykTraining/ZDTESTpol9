package dodatkowe_zadania.java_podstawy_dzien_trzeci;

public class PersonMain {

    public static void main(String[] args) {

        Person firstPerson = new Person();

        firstPerson.setAge(23);
        firstPerson.getGender();

        Person man = new Person(47, "male");
        System.out.println("Our person is " + man.getGender());

    }
}
