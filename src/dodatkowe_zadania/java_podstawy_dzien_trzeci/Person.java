package dodatkowe_zadania.java_podstawy_dzien_trzeci;

public class Person {

    private int age;
    private String gender;
    public String pesel;


    public Person() {
    }

    public Person(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }
}
