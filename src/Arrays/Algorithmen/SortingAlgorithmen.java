package Arrays.Algorithmen;

public class SortingAlgorithmen {
    public static void main(String[] args) {
        int[] array = {10, 2, 100, -300, 5, 102, 0, 50};
        printArray("Before Sort", array);
        bubbleSort(array);
        printArray("After  Sort", array);


    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    swap(array, j + 1, j);
                }
            }
        }


    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(String arrayName, int[] array) {
        System.out.print(arrayName + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

}
