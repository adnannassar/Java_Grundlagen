package Arrays.TwoDimArray;

public class TwoDimArray {
    public static void main(String[] args) {
        // nummer sind bekannt
        int[][] array = {
                {1, 1, 2, 5, 1, 7},
                {2, 2},
                {3, 0, 1, 3}};

        System.out.println("Array1: ");
        print(array);

        // nummer sind nicht bekannt
        int[][] array2 = new int[3][3];
        fillArray(array2);
        System.out.println("Array2: ");
        print(array2);


    }

    public static void fillArray(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter++;
            }
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
