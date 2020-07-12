package dodatkowe_zadania.java_podstawy_dzien_trzeci;

public class VarArgsExample {

    public static void main(String[] args) {
        System.out.println(sumTwoArgs(2, 3));
        System.out.println(sumVarArgs("someName", 2, 3));

        sumVarArgs("someName", 2, 2, 2, 33, 3, 3, 4, 4, 4, 4, 44, 4, 4, 4, 4, 4, 4, 4);
        int[] someArray = {2, 3, 4, 5, 6};
        System.out.println(sumArray(someArray));

    }


    private static int sumTwoArgs(int firstArgument, int secondArgument) {
        return firstArgument + secondArgument;
    }

    private static int sumVarArgs(String name, int... args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result = result + args[i];
            // result += args[i];
        }
        return result;
    }

    private static int sumArray(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result = result + args[i];
            // result += args[i];
        }
        return result;
    }
}
