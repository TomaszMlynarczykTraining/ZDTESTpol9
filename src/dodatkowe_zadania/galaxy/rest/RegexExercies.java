package dodatkowe_zadania.galaxy.rest;

public class RegexExercies {

    public static void main(String[] args) {

        //System.out.println(removeNumbers("T123om24as232z24"));
        //System.out.println(replaceAToAt("andrzej"));
        // System.out.println(checkIfEmailCorrect("tomasz@gmail.com"));
        // System.out.println(checkIfEmailCorrect("tomasz#gmail.c23om"));

/*        for (String word : splitIntoWords("Best Java course in whole wide world!")) {
            System.out.println(word);
        }*/
/*
        System.out.println(checkIfHouseNrCorrect("123\\2A"));

        System.out.println(checkIfHouseNrCorrect("24B\\3"));
        System.out.println(checkIfHouseNrCorrect("12\\5"));
        System.out.println(checkIfHouseNrCorrect("abc\\cba"));
*/


        System.out.println(checkIfCityNameCorrect("Wroclaw"));
        System.out.println(checkIfCityNameCorrect("Zielona Gora"));
        System.out.println(checkIfCityNameCorrect("Bielsko-Biala"));
        System.out.println(checkIfCityNameCorrect("Ptysiow123"));
        System.out.println(checkIfCityNameCorrect("Pty  si--ow"));


    }

    private static String removeNumbers(String string) {
        return string.replaceAll("\\d", "");
    }

    private static String replaceAToAt(String string) {
        return string.replaceFirst("a|A", "@");
    }

    private static boolean checkIfEmailCorrect(String string) {
        return string.matches("\\w{64}@\\w{255}\\.\\w{2,3}");
    }

    private static String[] splitIntoWords(String string) {
        return string.split("\\s");
    }

    private static boolean checkIfHouseNrCorrect(String string) {
        return string.matches("[A-Z0-9]+\\\\[A-Z0-9]+");
    }


    private static boolean checkIfCityNameCorrect(String string) {
        return string.matches("[A-Z][a-zA-z-\\s]+");
    }
}
