package zadania_dzien_drugi;
//3. Utwórz klasę Calculator,
// która posiada jedną metodę run(),
// w której jedyną implementacją będzie wyświetlenie tekstu : „Initializing calculator…”.


import java.util.Scanner;

//Przerób metodę run() tak, by przyjmowała dwie liczby z poziomu konsoli i wyświetlała je użytkownikowi.
public class Calculator {

    //metoda run() musi byc uruchamiana z poziomu metody main w innej klasie, bądź gdziekolwiek
    //indziej gdzie stworzymy obiekt typu kalkulator.
    public void run() {
        System.out.println("Initializing calculator…");

        Scanner myScanner = new Scanner(System.in);
        long firstNumberFromConsole = myScanner.nextLong();
        long secondNumberFromConsole = myScanner.nextLong();

        System.out.println("Pierwsza liczba to: " + firstNumberFromConsole);
        System.out.println("Druga liczba to: " + secondNumberFromConsole);

    }
}
