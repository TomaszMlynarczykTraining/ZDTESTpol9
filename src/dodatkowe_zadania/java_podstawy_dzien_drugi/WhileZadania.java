package dodatkowe_zadania.java_podstawy_dzien_drugi;

import java.util.Scanner;

public class WhileZadania {

    public static void main(String[] args) {
        //addToBasket();
        //sumMoreThan10();
        //endlessUntilEnd();
        //endlessUntilEndWithoutLastPrompt();
    }

    private static void endlessUntilEnd() {
        String input = "";
        // while (!input.equals("koniec")){
        while (!input.equals("koniec")) {
            Scanner myScanner = new Scanner(System.in);
            String line = myScanner.nextLine();
            System.out.println(line);
            input = line;
        }
    }

    private static void endlessUntilEndWithoutLastPrompt() {
        String input = "";

        do {
            Scanner myScanner = new Scanner(System.in);
            String line = myScanner.nextLine();
            if (!line.equals("koniec")) {
                System.out.println(line);
            }
            input = line;
        }
        while (!input.equals("koniec"));
    }

    private static void sumMoreThan10() {

        int i = 0;
        int result = 0;

        while (i < 5) {
            Scanner myScanner = new Scanner(System.in);
            int value = myScanner.nextInt();
            if (value > 10) {
                result = result + value;
            }
            System.out.println("Aktualna wartość sumy to " + result);
            i++;
        }
        System.out.println("Wynik to " + result);
    }

    private static void addToBasket() {
        int i = 0;
        while (i < 10) {
            Scanner myScanner = new Scanner(System.in);
            String product = myScanner.nextLine();
            System.out.println("Dodałem do koszyka produkt " + product
                    + " o numerze " + i);
            i++;

        }
    }
}
