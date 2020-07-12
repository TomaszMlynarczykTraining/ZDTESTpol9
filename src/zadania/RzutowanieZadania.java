package zadania;

public class RzutowanieZadania {

    public static void main(String[] args) {


//1. Konwersja na dwa miejsca po przecinku
        double v = 2.3244;
        System.out.printf("%.2f", v);


//2. i 3. Konwersje typów i wyświetlanie
        int conversionInt = 23455;

        long conversionInt1 = conversionInt;
        byte conversionByte = (byte) conversionInt;
        char conversionChar = (char) conversionInt;

        System.out.println(conversionInt1);
        System.out.println(conversionByte);
        System.out.println(conversionChar);
    }

    private static double returnDouble(double arg1, int arg2, String arg3) {
        double v = 2.424;
        return v;
    }
}
