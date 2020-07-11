package przyklady;

public class WhilePrzyklad {

    public static void main(String[] args) {

        int iterator = 1;

        //nigdy sie nie wykona, bo warunek jest niespelniony
        while (iterator > 4) {
            System.out.println("Wartość zmiennej iterator to " + iterator);
        }

        //petla nieskonczona, bo warunek jest zawsze spelniony
/*        while (iterator > 0) {
            System.out.println("Wartość zmiennej iterator to " + iterator);
        }*/


        //petla wykona sie 3krotnie, poniewaz tylko 3 razy warunek bedzie spelniony, za kazdym przejsciem petli
        //wartosc iteratora bedzie wiekosza o 1
        while (iterator < 4) {
            System.out.println("Wartość zmiennej iterator to " + iterator);
            iterator++;
        }

    }
}
