package przyklady;

public class DoWhilePrzyklad {

    public static void main(String[] args) {

        int iterator = 1;

        //przyklad ze zwyklym while
        System.out.println("Petla While");
        while (iterator > 4) {
            System.out.println("Wartość zmiennej iterator to " + iterator);
        }

        //wykona sie raz pomimo niespelnienia warunku
        System.out.println("Petla do while");
        do {
            System.out.println("Wartość zmiennej iterator to " + iterator);
        } while (iterator > 4);

    }
}
