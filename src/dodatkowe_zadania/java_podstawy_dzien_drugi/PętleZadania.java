package dodatkowe_zadania.java_podstawy_dzien_drugi;

import java.util.Scanner;

public class PętleZadania {

    public static void main(String[] args) {
        //showProducts();
        //addInLoop();
        //doubleLoops();
        //drawSquare();
        //drawSquareWithSign();
        //drawTree(4);
    }

    private static void drawSquareWithSign() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Podaj dlugosc boku");
        int value = myScanner.nextInt();

        System.out.println("Podaj znak");
        String sign = myScanner.nextLine();


        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print(sign + " ");
            }
            System.out.println();
        }
    }

    private static void drawTree(int lines) {
        String result = "";
        for (int i = 0; i < lines; i++) {
            result = result + "*";
            System.out.println(result);
        }
    }


    private static void drawSquare() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc boku");
        int value = myScanner.nextInt();

        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void doubleLoops() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + ":" + j);
            }
        }
    }

    private static void addInLoop() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            Scanner myScanner = new Scanner(System.in);
            int value = myScanner.nextInt();
            result = result + value;
        }

        System.out.println("Wynik to " + result);
    }

    private static void showProducts() {
        for (int i = 0; i < 10; i++) {
            Scanner myScanner = new Scanner(System.in);
            String product = myScanner.nextLine();
            System.out.println("Dodałem do koszyka produkt " + product
                    + " o numerze " + i);
        }

    }
}
