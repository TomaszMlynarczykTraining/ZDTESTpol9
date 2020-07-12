package dodatkowe_zadania.java_podstawy_dzień_czwarty.bookstore;

import dodatkowe_zadania.java_podstawy_dzien_trzeci.Person;
import zadania.Calculator;

public class Bookstore {

    public static void main(String[] args) {
        Author author = new Author("Tomasz", "Młynarczyk");

        Book javaBook = new Book("Podstawy Javy", 106, author);
        Book secondBook = new Book("Podstawy Javy", 106, author);

        int result = Calculator.add(javaBook.getNumberOfPages(), secondBook.getNumberOfPages());

        System.out.println("Total number of pages is " + result);


        Person[] people = {new Person(2, "male")};
        javaBook.setPeopleWhoBorrowed(people);

        Author bookAuthor = javaBook.getAuthor();
        bookAuthor.showFullName();
        javaBook.getAuthor().showFullName();

        Person[] peopleWhoBorrowed = javaBook.getPeopleWhoBorrowed();
        Person person = peopleWhoBorrowed[0];
        person.getGender();
    }
}
