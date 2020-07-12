package dodatkowe_zadania.java_podstawy_dzień_czwarty.staticClasses;

public class ExtremeCalculator {

    public static void main(String[] args) {

        StaticCalcuator.SubStaticCalculator subStaticCalculator = new StaticCalcuator.SubStaticCalculator();

        subStaticCalculator.getNumberOfCalculations();

        StaticCalcuator staticCalcuator = new StaticCalcuator();
        StaticCalcuator.SubCalculator subCalculator = staticCalcuator.new SubCalculator();





/*        System.out.println(codeByCesarCode("abc", 1));
        System.out.println(codeByCesarCode("zzz", 3));
        System.out.println(codeByCesarCode("Tomasz", 3));*/


        int[] primes = performSieveOfErathones(5);

        for (int prime : primes) {
            if (prime > 0)
                System.out.println("Prime is " + prime);
        }
    }


    public static String codeByCesarCode(String stringToCode, int step) {
        String result = "";
        for (int x = 0; x < stringToCode.length(); x++) {
            char c = (char) (stringToCode.charAt(x) + step);
            if (c > 'z')
                result += (char) (stringToCode.charAt(x) - (26 - step));
            else
                result += c;
        }
        return result;
    }


    public static int[] performSieveOfErathones(int upperLimit) {
        boolean[] prime = new boolean[upperLimit + 1];
        int[] integerPrimes = new int[upperLimit + 1];
        for (int i = 0; i < upperLimit; i++)
            prime[i] = true;

        for (int p = 2; p * p <= upperLimit; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= upperLimit; i += p)
                    prime[i] = false;
            }
        }
        int j = 0;

        for (int i = 2; i <= upperLimit; i++) {
            if (prime[i]) {
                integerPrimes[j] = i;
                j++;
            }
        }
        return integerPrimes;
    }
}
