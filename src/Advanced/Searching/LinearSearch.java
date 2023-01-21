package Advanced.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{2, 7, 1, 5, 4}, 5));
    }

    public static boolean linearSearch(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
