package przyklady;

public class ForEachPrzyklad {

    public static void main(String[] args) {

        // tablice w Java sa przetwarzane od 0 elementu,
        // wiec number[0] zwroci nam pierwszy element
        int numbers[] = {1, 4, 57, 32, 53};

        //zmienna pomocnicza na sume, by poprawnie przeliczac wartosci i miec dostep poza petla
        int sum = 0;

        //petla for each wykona sie tyle razy ile jest elementow w tablicy.
        for (int number : numbers) {
            System.out.println("Element z tablicy to " + number);
            sum = sum + number;
        }

        System.out.println("Suma to " + sum);


        int sumFor = 0;

        //zwykly for, ten sam wynik
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element z tablicy to " + numbers[i]);
            sumFor = sumFor + numbers[i];
        }

        System.out.println("Suma dla petli for  to " + sumFor);
    }
}
