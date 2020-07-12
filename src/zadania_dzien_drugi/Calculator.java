package zadania_dzien_drugi;

import java.util.Scanner;
//3. Utwórz klasę Calculator,
// która posiada jedną metodę run(),
// w której jedyną implementacją będzie wyświetlenie tekstu : „Initializing calculator…”.


//Przerób metodę run() tak, by przyjmowała dwie liczby z poziomu konsoli i wyświetlała je użytkownikowi.


//2. Wróć do klasy Calculator – zaimplementuj metody na dodawanie, odejmowanie,
//dzielenie i mnożenie, które jako argumenty przyjmą dwie liczby, a zwrócą wynik.


//4. W klasie Calculator przerób wyświetlanie instrukcji tak, by każdy String był osobną
//zmienną final deklarowaną jako parametr klasy


/*4. Wróć do klasy Calculator, i dodaj przyjmowanie nowego parametru – jaką operację
        chcesz wykonać (1 – dodawanie, 2 – odejmowanie, 3 – mnożenie, 4 – dzielenie) – w
        zależności od parametru wywołaj odpowiednią metodę i wyświetl wynik*/

public class Calculator {

    //stałe, które mogą być używane w klasie wielokrotnie, i są ustandaryzowanymi napisami
    private final String INTITALIZATION_MESSAGE = "Initializing calculator…";
    private final String FIRST_ARGUMENT_MESSAGE = "Pierwsza liczba to: ";
    private final String SECOND_ARGUMENT_MESSAGE = "Druga liczba to: ";
    private final String USER_MESSAGE = "Jaką akcję chcesz podjąć? 1 - dodawanie, 2 - mnożenie";
    private final String PARAMETR_MESSAGE = "Proszę podaj dwa parametry";


    //metoda run() musi byc uruchamiana z poziomu metody main w innej klasie, bądź gdziekolwiek
    //indziej gdzie stworzymy obiekt typu kalkulator.
    public void run() {

        System.out.println(INTITALIZATION_MESSAGE);

        Scanner myScanner = new Scanner(System.in);

        //przyjmowanie wyboru uzytkownika
        System.out.println(USER_MESSAGE);
        long userChoice = myScanner.nextLong();

        //przyjmowanie parametrow
        System.out.println(PARAMETR_MESSAGE);
        long firstNumberFromConsole = myScanner.nextLong();
        long secondNumberFromConsole = myScanner.nextLong();

        //wyswieltanie parametrow
        System.out.println(FIRST_ARGUMENT_MESSAGE + firstNumberFromConsole);
        System.out.println(SECOND_ARGUMENT_MESSAGE + secondNumberFromConsole);


        //instrukcja warunkowa dzieki ktorej dokonujemy wlasciwego obliczenia
        long result;
        if (userChoice == 1) {
            //odwolanie do metody obliczajacej ktora napisalismy wczesniej
            result = addTwoNumbers(firstNumberFromConsole, secondNumberFromConsole);
        } else if (userChoice == 2) {
            result = multiplyTwoNumbers(firstNumberFromConsole, secondNumberFromConsole);
        } else {
            result = 0;
        }

        System.out.println(result);

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
