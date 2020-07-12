package zadania_dzien_drugi;
//3. Utwórz klasę Calculator,
// która posiada jedną metodę run(),
// w której jedyną implementacją będzie wyświetlenie tekstu : „Initializing calculator…”.


import java.util.Scanner;

//Przerób metodę run() tak, by przyjmowała dwie liczby z poziomu konsoli i wyświetlała je użytkownikowi.


//2. Wróć do klasy Calculator – zaimplementuj metody na dodawanie, odejmowanie,
//dzielenie i mnożenie, które jako argumenty przyjmą dwie liczby, a zwrócą wynik.


//4. W klasie Calculator przerób wyświetlanie instrukcji tak, by każdy String był osobną
//zmienną final deklarowaną jako parametr klasy

public class Calculator {

    //stałe, które mogą być używane w klasie wielokrotnie, i są ustandaryzowanymi napisami
    private final String INTITALIZATION_MESSAGE = "Initializing calculator…";
    private final String FIRST_ARGUMENT_MESSAGE = "Pierwsza liczba to: ";
    private final String SECOND_ARGUMENT_MESSAGE = "Druga liczba to: ";


    //metoda run() musi byc uruchamiana z poziomu metody main w innej klasie, bądź gdziekolwiek
    //indziej gdzie stworzymy obiekt typu kalkulator.
    public void run() {

        System.out.println(INTITALIZATION_MESSAGE);

        Scanner myScanner = new Scanner(System.in);
        long firstNumberFromConsole = myScanner.nextLong();
        long secondNumberFromConsole = myScanner.nextLong();

        System.out.println(FIRST_ARGUMENT_MESSAGE + firstNumberFromConsole);
        System.out.println(SECOND_ARGUMENT_MESSAGE + secondNumberFromConsole);

    }

    //metoda publiczna, przyjmuje dwa argumenty, i zwraca za pomocą return wyniki ich dodawania
    public long addTwoNumbers(long firstNumber, long secondNumber) {
        long result = firstNumber + secondNumber;
        return result;
    }

    //metoda publiczna, przyjmuje dwa argumenty, i zwraca za pomocą return wyniki ich dodawania
    public long multiplyTwoNumbers(long firstNumber, long secondNumber) {
        long result = firstNumber * secondNumber;
        return result;
    }
}
