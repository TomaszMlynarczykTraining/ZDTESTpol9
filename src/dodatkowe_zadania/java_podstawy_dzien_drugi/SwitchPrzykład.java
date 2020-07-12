package dodatkowe_zadania.java_podstawy_dzien_drugi;

public class SwitchPrzykład {

    public static void main(String[] args) {

        int zmienna = 4;
        switch (zmienna) {
            case 15:
                System.out.println("Liczba jest równa 15");
                break;
            case 4:
                System.out.println("Liczba jest równa 4");
                break;

            default:
                System.out.println("Liczba nie jest równa 4 ani 15");
        }

        if (zmienna == 15) {
            System.out.println("Liczba jest równa 15");
        }
        if (zmienna == 4) {
            System.out.println("Liczba jest równa 4");
        }
        if (zmienna != 15 && zmienna != 4) {
            System.out.println("Liczba nie jest równa 4 ani 15");
        }
    }
}
