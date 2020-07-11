package przyklady;

public class ForPrzykłąd {

    public static void main(String[] args) {

        //pętla for, wykona się 10 razy, inkremetnacja
        //zakres zycia zmiennej i ogranicza się do ciała pętli
        for (int i = 0; i < 10; i++) {
            System.out.println("Wartość iteratora to " + i);
        }


        //pętla for, wykona się 10 razy, dekrementacja
        for (int i = 10; i > 0; i--) {
            System.out.println("Wartość iteratora to " + i);
        }
    }
}
