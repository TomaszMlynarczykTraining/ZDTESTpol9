package przyklady;

public class NestedLoopPrzyklad {

    public static void main(String[] args) {


        //pierwsza petla i ktora wykona sie 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracja pętli i " + i);

            //dla kazdego wykonania petli i petla j wykona sie 10 razy
            for (int j = 0; j < 10; j++) {
                System.out.println("Iteracja pętli j " + j);
            }
        }


        //zmienne tablicowe wielowymiarowe
        int[][] multiArray = new int[2][2];


        //wypelniamy wszystkie wartosci w macierzy 2x2 wartoscia 1
        for (int wiersz = 0; wiersz < multiArray.length; wiersz++) {
            for (int kolumna = 0; kolumna < multiArray.length; kolumna++) {
                multiArray[wiersz][kolumna] = 1;
            }
        }
    }
}
