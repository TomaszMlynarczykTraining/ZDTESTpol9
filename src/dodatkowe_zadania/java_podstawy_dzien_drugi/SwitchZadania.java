package dodatkowe_zadania.java_podstawy_dzien_drugi;

import java.util.Scanner;

public class SwitchZadania {

    public static void main(String[] args) {
        charWrapper();

    }

    private static void charWrapper() {
        Scanner myScanner = new Scanner(System.in);
        int first = myScanner.nextInt();


        switch (first) {
            case 0:
                System.out.println("$");
                break;
            case 1:
                System.out.println("#");
                break;
            case 2:
                System.out.println("*");
                break;

            default:
                System.out.println("Znak nierozpoznany");
        }
    }
}
