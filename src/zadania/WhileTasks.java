package zadania;

import java.util.Scanner;

public class WhileTasks {

    public static void main(String[] args) {
/*        1. Wewnątrz pętli while (np. 10 razy) pobieraj produkt do kupienia i wyświetlaj go na ekran
        w postaci : „Dodałem do koszyka <nazwa>, to nasz <numer iteracji> produkt!”*/

        Scanner myScanner = new Scanner(System.in);

        int iterator = 0;
        while (iterator < 2) {
            String nextLine = myScanner.nextLine();
            System.out.println("Nazwa produktu " + nextLine + " iterator " + iterator);
            iterator++;
        }


/*        2. Stwórz pętle while, która wykona 5 iteracji. Wewnątrz pętli pobieraj z konsoli dowolną
        wartość typu int. Po wyjściu z pętli zwróć sumę tych wartości.*/

        int resultOfWhile = 0;
        int secondIterator = 0;

        while (secondIterator < 5) {
            int nextInt = myScanner.nextInt();
            resultOfWhile = resultOfWhile + nextInt;
            secondIterator++;
        }

        System.out.println("Wynik dodawania w petli while to " + resultOfWhile);
    }
}
