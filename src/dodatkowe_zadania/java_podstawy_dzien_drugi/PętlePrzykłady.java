package dodatkowe_zadania.java_podstawy_dzien_drugi;


public class PętlePrzykłady {

    public static void main(String[] args) {

        //Nieskończona pętla
/*        for (int i = 0; true; i++) {
            System.out.println("Aktualna wartość iteratora " + i);
           // i++;
        }*/


        System.out.println("_______________________");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Aktualna wartość iteratora " + i);
        }

        System.out.println("_______________________");

        for (int i = 0; i <= 5; ++i) {
            System.out.println("Aktualna wartość iteratora " + i);
        }
    }
}
