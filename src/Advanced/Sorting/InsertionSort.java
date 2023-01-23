package Advanced.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 0, 5};
        System.out.print("Before: ");
        ArrayTools.printOneDimArray(array);
        insertionSort(array);
        System.out.print("After:  ");
        ArrayTools.printOneDimArray(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    ArrayTools.swap(array, j, j - 1);
                }
            }
        }
    }
}
