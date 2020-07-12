package zadania;

import java.util.Scanner;

public class Calculator {

    private final static String INITIALIZE_MSG = "Initializing calculator";
    private final static String FIRST_ARG_IS = "Pierwszy argument to:";
    private final static String SECOND_ARG_IS = "Drugi argument to: ";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(INITIALIZE_MSG);
        Scanner myScanner = new Scanner(System.in);
        int first = myScanner.nextInt();
        int second = myScanner.nextInt();
        //int result = first + second;

        System.out.println(FIRST_ARG_IS + first);
        System.out.println(SECOND_ARG_IS + second);

        System.out.println("Podaj rodzaj operacji");
        int decision = myScanner.nextInt();

        int result = 0;

        switch (decision) {
            case 1:
                result = first + second;//add(first, second);
                break;
            case 2:
                result = substract(first, second);
                break;
            case 3:
                result = multiply(first, second);
                break;
            case 4:
                result = divide(first, second);
                break;

            default:
                System.out.println("Nie rozpoznano operacji");
        }

  /*      if(decision==1) {
            result = add(first, second);
        }

        if(decision==2) {
            result = substract(first, second);
        }

        if(decision==3) {
            result = multiply(first, second);
        }
        if(decision==4) {
            result = divide(first, second);
        }*/

        System.out.println("Wynik to " + result);
    }


    public static int add(int a1, int a2) {
        int result = a1 + a2;
        return result;
    }


    public static int substract(int a1, int a2) {
        return a1 - a2;
    }

    public static int multiply(int a1, int a2) {
        return a1 * a2;
    }

    public static int divide(int a1, int a2) {
        return a1 / a2;
    }
}
