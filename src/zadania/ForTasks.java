package zadania;

import java.util.Scanner;

public class ForTasks {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Zadanie 1

        for (int i = 0; i < 2; i++) {
            String product = myScanner.nextLine();
            System.out.println("Dodałem do koszyka produkt " + product
                    + " o numerze " + i);
        }

        //Zadanie 2

        System.out.println("Zadanie drugie");
        int result = 0;

        for (int i = 0; i < 5; i++) {
            int value = myScanner.nextInt();
            result += value;
        }

        System.out.println("Wynik to " + result);
    }


}
