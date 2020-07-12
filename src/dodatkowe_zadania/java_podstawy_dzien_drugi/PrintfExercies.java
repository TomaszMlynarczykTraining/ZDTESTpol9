package dodatkowe_zadania.java_podstawy_dzien_drugi;

public class PrintfExercies {

    public static void main(String[] args) {

        /*
        s – Strings
        d – liczby całkowite
        f – zmienno przecinkowe
        t– data
        %n - separator lini
        /
        */


        System.out.printf("%s %s jakis napis %n", "Nasze słowo na dzisiaj to", "cwiczenie");
        System.out.printf("%S %n", "cwiczenie");

        System.out.printf("%.4s", "cwiczenie!");

        System.out.printf("Liczba to : %d%n", 10000L);

        System.out.printf("'%.2f'%n", 5.1473);
        System.out.printf("'%S' %n", "cwiczenie");

        System.out.println();
        System.out.printf("%s %s", "cwiczenie", "drugie zajęcia");
        System.out.println();
        System.out.printf("'%15s' %n", "cwiczenie");

        System.out.printf("%2.2s", "cwiczenie!");

        String naszString = "nasz String";

        //naszString.toUpperCase();
        //String secondString = new String("Nasz drugi napis");


        long myLong = 23L;

        float myFloat = 23.42F;

        // liczby

        System.out.printf("Liczba to : %d%n", 10000L);

        //zmiennoprzecinkowe

        System.out.printf("'%5.2f'%n", 5.1473);
    }

}
