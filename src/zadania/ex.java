package zadania;

import java.util.Scanner;

public class ex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą z zakresu 0-9:");
        float y = scanner.nextFloat();
        if (y == 0) {
            System.out.println("*");
        } else if (y == 1) {
            System.out.println("!");
        } else if (y == 2) {
            System.out.println("@");
        } else if (y == 3) {
            System.out.println("#");
        } else if (y == 4) {
            System.out.println("$");
        } else if (y == 5) {
            System.out.println("%");
        } else if (y == 6) {
            System.out.println("^");
        } else if (y == 7) {
            System.out.println("&");
        } else if (y == 8) {
            System.out.println("(");
        } else if (y == 9) {
            System.out.println(")");
        } else
            System.out.println("Liczba poza zakresem 0-9");
    }

}

