package Advanced.Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 0, 5};
        System.out.print("Before: ");
        ArrayTools.printOneDimArray(array);
        selectionSort(array);
        System.out.print("After:  ");
        ArrayTools.printOneDimArray(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }

            }
            ArrayTools.swap(array, i, minIndex);
        }
    }
}
