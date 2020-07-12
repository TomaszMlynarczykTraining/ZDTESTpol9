package dodatkowe_zadania.java_podstawy_dzien_drugi;

public class TabliceZadania {

    public static void main(String[] args) {
        int[] processedArray = {3, 23, 1, 5};
        //print(processedArray);

        //System.out.println(getMax(processedArray));
        //System.out.println(getMin(processedArray));
        int[] secondProcessedArray = {1, 2, 1, 5};
        int[] largerArray = getLarger(processedArray, secondProcessedArray);

        for (int element : largerArray) {
            System.out.println(element);
        }
    }


    private static int[] getLarger(int[] processedArray, int[] secondProcessedArray) {

        int sumOfFirstArray = 0;
        int sumOfSecondArray = 0;
        for (int element : processedArray) {
            sumOfFirstArray = sumOfFirstArray + element;
        }

        for (int element : secondProcessedArray) {
            sumOfSecondArray = sumOfSecondArray + element;
        }

        if (sumOfFirstArray > sumOfSecondArray) {
            return processedArray;
        }

        return secondProcessedArray;
    }

    private static int getMax(int[] processedArray) {

        int result = processedArray[0];
        for (int element : processedArray) {
            if (element > result) {
                result = element;
            }
        }
        return result;
    }


    private static int getMin(int[] processedArray) {

        int result = processedArray[0];
        for (int element : processedArray) {
            if (element < result) {
                result = element;
            }
        }
        return result;
    }


    private static void print(int[] processedArray) {
        for (int element : processedArray) {
            System.out.println(element);
        }
    }
}
