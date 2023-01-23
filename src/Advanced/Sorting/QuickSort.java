package Advanced.Sorting;

public class QuickSort {

    public static void quickSort(int array[], int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        int i = low;
        int j = high;

        while (i <= j) { // the range is between low (i) and high(j)
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i<= j) { // replacement should be done
                ArrayTools.swap(array, i, j);
                i++;
                j--;

            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (i<high) {
            quickSort(array, i, high);
        }

    }
}
