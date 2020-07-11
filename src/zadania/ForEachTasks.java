package zadania;

public class ForEachTasks {

    public static void main(String[] args) {

/*        1. Napisz implemetację, która wypisze w konsoli elementy tablicy intów,
zadeklarowanej wcześniej,*/

        int[] myArrayOfInts = {4, 21, 54, 34};

        for (int nextInteger : myArrayOfInts) {
            System.out.println("Kolejna wartość całkowita to: " + nextInteger);
        }


/*       2. Następnie zaimplemetnuj rozwiązanie, które wyświetli największy element z
powyższej tablicy,*/

        int maxInteger = 0;

        for (int checkedInteger : myArrayOfInts) {
            if (checkedInteger > maxInteger) {
                maxInteger = checkedInteger;
            }
        }

        System.out.println("Największy element to: " + maxInteger);


    }
}
