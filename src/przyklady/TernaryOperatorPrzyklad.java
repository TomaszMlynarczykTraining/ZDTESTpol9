package przyklady;

public class TernaryOperatorPrzyklad {

    public static void main(String[] args) {

        String myString;

        if (4 > 2) {
            myString = "4 jest wieksze od 2";
        }

        System.out.println(myString);

        //tenrary operator, zapis skrocony instrukcji if
        myString = 5 > 1 ? "5 jest wieksze od 1" : "5 nie jest mniejsze od 1";

        //zwykly zapis, wynik jest taki sam jak w operacji powyzej
        if (5 > 1) {
            myString = "5 jest wieksze od 1";
        } else {
            myString = "5 nie jest mniejsze od 1";
        }


        System.out.println(myString);
    }
}
