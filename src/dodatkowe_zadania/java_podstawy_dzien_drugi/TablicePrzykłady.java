package dodatkowe_zadania.java_podstawy_dzien_drugi;

public class TablicePrzykłady {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        int[] tablica2 = {1, 2, 3};

        String ds = "ds";
        String dsd = new String("dsd");

        System.out.println(tablica.length);

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Wartość przed inicjacją elementu " + i
                    + ": " + tablica[i]);
        }

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 2;
        }

/*
        for (int i = 0; i <tablica.length ; i++) {
            System.out.println("Wartość po inicjacji elementu " + i
                    + ": " +tablica[i]);
        }
*/

        for (int element : tablica) {
            System.out.println("Wartość po inicjacji elementu " + element);
        }


        String[] products = {"jabłko", "gruszka", "dynia"};

        for (String product : products) {
            System.out.println(product);
        }
    }
}
