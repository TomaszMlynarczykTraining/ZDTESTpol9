package dodatkowe_zadania.java_podstawy_dzien_drugi;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {


        int firstArg = 12;
        int secondArg = 15;

        String firstString = "Dane";
        String secondString = "Dane";

        if (secondString.equals(firstString)) {
            System.out.println("Napisy są takie same!");
        }

        if (firstArg > secondArg || firstArg == secondArg) {
            System.out.println("Liczba pierwsz jest większa od drugiej " +
                    "lub jest równa");
        } else if (firstArg < secondArg) {
            System.out.println("Druga liczba jest większa");
        } else if (firstArg > secondArg) {
            System.out.println("Pierwsza liczba jest większa");
        } else {
            System.out.println("Stan nieokreślony");
        }

        boolean result = firstArg < secondArg;

        if (result) {
            System.out.println("Warunek z booleanem");
        }
    }
}
