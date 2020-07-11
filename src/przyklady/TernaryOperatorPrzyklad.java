package przyklady;

public class TernaryOperatorPrzyklad {

    public static void main(String[] args) {

        String myString;

        if (4 > 2) {
            myString = "4 jest wieksze od 2";
        }

        System.out.println(myString);

        myString = 5 > 1 ? "5 jest wieksze od 1" : "5 nie jest mniejsze od 1";

        if (5 > 1) {
            myString = "5 jest wieksze od 1";
        } else {
            myString = "5 nie jest mniejsze od 1";
        }


        System.out.println(myString);
    }
}
