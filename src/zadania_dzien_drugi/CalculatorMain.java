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

        //możemy tutaj użyć nowej metody addTwoNumbers
        long addResult = myCalculator.addTwoNumbers(4, 5);
        long multiplyResult = myCalculator.multiplyTwoNumbers(4, 5);
        System.out.println(addResult);
        System.out.println(multiplyResult);

    }
}
