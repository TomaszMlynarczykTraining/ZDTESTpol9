package zadania_dzien_drugi;


import java.util.Random;
import java.util.Scanner;

/*Utwórz tablicę przechowującą wartości typu int o rozmiarze zadanym z konsoli.
Wypełnij ją wartościami wewnątrz pętli for. Zwróć sumę tych wartości.

Stwórz tablicę zawierającą 5 imion. Wewnątrz pętli for-each dopisuj imiona
do zmiennej typu String, oddzielając je przecinkami. Wyświetl utworzony łańcuch znaków.
Np. „Małgorzata, Jan, Jakub”.*/
public class LoopsTasks {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int sizeOfArray = myScanner.nextInt();

        int[] arrayOfGivenSize = new int[sizeOfArray];

        //sizeOfArray == arrayOfGivenSize.length

        //generowanie losowej wartości
        Random random = new Random();

        //wpisywanie losowych wartości dla wszystkich elementów tablicy od 0 do array.length
        for (int i = 0; i < arrayOfGivenSize.length; i++) {
            arrayOfGivenSize[i] = random.nextInt();
        }

        //wyswietlanie
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Element tablicy " + i + " " + arrayOfGivenSize[i]);
        }

    }
}
