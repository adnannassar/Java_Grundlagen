package Arrays;

import java.util.Random;

public class OneDimArray {
    public static void main(String[] args) {
        // Nummern sind bewusst
        int[] array1 = {100, 50, 2, 1, 5};
        printArray("Array 1", array1);

        int n = 2;
        System.out.print("Searching for " + n + " in Array 1: ");
        boolean searchResult = search(array1, n);
        int index = searchIndex(array1, n);
        if (searchResult == true) {
            System.out.print("found, at index " + index);
        } else {
            System.out.print("not found!");
        }

        System.out.println("\n");

        // Nummern sind nicht bewusst
        int[] array2 = new int[10]; // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        fillArrayWithRandomNumbersUsingMathClass(array2);
        printArray("Array 2 (Random numbers)", array2);
        System.out.println();

        System.out.println("Multiplication Table: ");
        printMultiplicationTable(array2);

    }

    public static void fillArrayWithRandomNumbersUsingRandomClass(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            array[i] = randomNumber;
        }
    }

    public static void fillArrayWithRandomNumbersUsingMathClass(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 50 + 1);
            array[i] = random;
        }
    }

    public static void printArray(String arrayName, int[] array) {
        System.out.print(arrayName + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void fillArrayWithForLoop(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n * (i + 1);
        }
    }

    public static void printMultiplicationTable(int[] array) {
        for (int i = 0; i < array.length; i++) {
            fillArrayWithForLoop(array, i + 1);
            printArray((i + 1) + "", array);
        }
    }

    public static boolean search(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static int searchIndex(int[] array, int n) {
        if (search(array, n) == true) {
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == n) {
                    index = i;
                }
            }
            return index;
        }
        return -1;
    }

}
