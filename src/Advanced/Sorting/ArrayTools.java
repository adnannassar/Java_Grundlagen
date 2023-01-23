package Advanced.Sorting;

import java.util.Random;

public class ArrayTools {
    public static void printOneDimArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] fillOneDimArrayWithRandoms(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 1000000);
        }
        return array;
    }

    public static int[] fillOneDimArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        return array;
    }
}
