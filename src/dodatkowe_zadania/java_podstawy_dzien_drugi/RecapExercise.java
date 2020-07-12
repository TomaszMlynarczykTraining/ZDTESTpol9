package dodatkowe_zadania.java_podstawy_dzien_drugi;

import java.util.Scanner;

public class RecapExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String nextLine = scanner.nextLine();

        int firstArg = Integer.valueOf(firstLine);
        int secondArg = Integer.valueOf(nextLine);

        boolean result = firstArg > secondArg;
        System.out.println(result);

    }
}
