package zadania;

public class StringZadania {

    public static void main(String[] args) {
        concatenateStringsAndToUpper("first", "second");
        System.out.println(getFirstChar("first"));
    }

    //1. Metoda łącząca i wyświetlająca
    public static void concatenateStringsAndToUpper(String first, String second) {
        String firstUpper = first.toUpperCase();
        String secondUpper = second.toUpperCase();

        System.out.println(firstUpper + secondUpper);

        //2. Implementacja z StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstUpper);
        stringBuilder.append(secondUpper);
        System.out.println(stringBuilder);
    }

    //3. Pobieranie pierwszego char
    private static String getFirstChar(String givenString) {
        return givenString.substring(0, 1);
    }
}
