package Arrays.TwoDimArray;

public class LösungAufgabe003 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 9}};
        TwoDimArray.print(array);
        System.out.println("Durchschnitt: " + berechneDurchschnitt(array));
    }

    public static int berechneDurchschnitt(int[][] array) {
        int summe = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summe += array[i][j];
                counter++;
            }
        }
        return summe / counter;
    }
}
