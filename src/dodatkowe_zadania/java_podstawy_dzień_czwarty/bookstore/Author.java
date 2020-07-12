package dodatkowe_zadania.java_podstawy_dzień_czwarty.bookstore;

public class Author {

    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void showFullName() {
        System.out.println(firstName + " " + secondName);
    }
}
