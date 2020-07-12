package zadania_dzien_drugi;

public class CalculatorMain {

    //Klasę która zawiera metodę main
    //w tej klasie odwołujemy się do innych klas

    public static void main(String[] args) {
        //utworzenie i zastosowanie klasy kalkulator

        Calculator myCalculator = new Calculator();
        //uruchamianie metody z klasy którą wcześniej napisaliśmy
        // i której stworzyliśmy nowy obiekt
        myCalculator.run();

    }
}
