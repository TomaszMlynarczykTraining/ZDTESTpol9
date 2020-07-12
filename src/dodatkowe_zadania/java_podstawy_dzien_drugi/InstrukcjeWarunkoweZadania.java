package dodatkowe_zadania.java_podstawy_dzien_drugi;

import java.util.Scanner;

public class InstrukcjeWarunkoweZadania {

    public static void main(String[] args) {
        charWrapper();
        compareThree();
        isOdd(12);
    }

    private static void compareThree() {
        int firstInt = 12;
        int secondInt = 1;
        int thirdInt = 6;

        if (firstInt > secondInt) {
            if (firstInt > thirdInt) {
                System.out.println("Pierwszy int jest największy");
            } else {
                System.out.println("Trzeci int jest największy");
            }
        } else if (secondInt > thirdInt) {
            System.out.println("Drugi int jest największy");
        } else {
            System.out.println("Trzeci int jest największy");
        }
    }


    private static void charWrapper() {
        Scanner myScanner = new Scanner(System.in);
        int first = myScanner.nextInt();

        if (first == 0) {
            System.out.println("$");
        } else if (first == 1) {
            System.out.println("#");
        } else if (first == 2) {
            System.out.println("*");
        } else {
            System.out.println("Znak nierozpoznany");

        }
    }

    private static void isOdd(int arg) {
        if (arg % 2 == 0) {
            System.out.println("Jest parzysta");
        } else {
            System.out.println("Nie jest parzysta");
        }
    }

}
