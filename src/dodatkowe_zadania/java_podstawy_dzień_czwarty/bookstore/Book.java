package dodatkowe_zadania.java_podstawy_dzień_czwarty.bookstore;

import dodatkowe_zadania.java_podstawy_dzien_trzeci.Person;

public class Book {

    private String name;
    private int numberOfPages;
    private Author author;
    private Person[] peopleWhoBorrowed;


    public Book(String name, int numberOfPages, Author author) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public Person[] getPeopleWhoBorrowed() {
        return peopleWhoBorrowed;
    }

    public void setPeopleWhoBorrowed(Person[] peopleWhoBorrowed) {
        this.peopleWhoBorrowed = peopleWhoBorrowed;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
