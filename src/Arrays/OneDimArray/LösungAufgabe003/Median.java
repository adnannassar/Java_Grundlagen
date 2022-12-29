package Arrays.OneDimArray.LösungAufgabe003;

import Arrays.Algorithmen.SortingAlgorithmen;
import Arrays.OneDimArray.OneDimArray;
import Arrays.TwoDimArray.TwoDimArray;

public class Median {
    public static void main(String[] args) {
        int array1[] = {1, 5, 4, 3, 8};
        OneDimArray.printArray("array1", array1);
        System.out.println("Median von array1 = " + berechneMedian(array1));

        int array2[] = {1, 5, 4, 3, 2, 8};
        OneDimArray.printArray("array2", array2);
        System.out.println("Median von array2 = " + berechneMedian(array2));


    }


    public static double berechneMedian(int[] array) {
        SortingAlgorithmen.bubbleSort(array);
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        } else {
            double median1 = array[array.length / 2];
            double median2 = array[array.length / 2 - 1];
            return (median1 + median2) / 2;
        }
    }
}


