package dodatkowe_zadania.java_podstawy_dzien_trzeci;

public class MultiDimArray {

    public static void main(String[] args) {
        int[][][] exampleArray = new int[2][2][2];


        for (int wiersz = 0; wiersz < exampleArray.length; wiersz++) {
            for (int kolumna = 0; kolumna < exampleArray.length; kolumna++) {
                System.out.println("Element tablicy " + exampleArray[wiersz][kolumna]);
            }
        }
    }
}
