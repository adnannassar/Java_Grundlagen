package Advanced.Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 0, 5};
        System.out.print("Before: ");
        ArrayTools.printOneDimArray(array);
        bubbleSort(array);
        System.out.print("After:  ");
        ArrayTools.printOneDimArray(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayTools.swap(array, j, j + 1);
                }
            }
        }
    }
}
