package Advanced.Searching;

public class InterpolationSearch {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Index of " + n + " : " + interpolationSearch(new int[]{5, 10, 15, 20, 25, 30, 35, 40}, n));
    }

    public static int interpolationSearch(int[] array, int n) {
        int lastIndex = array.length - 1;
        int firstIndex = 0;
        while (n >= array[firstIndex] && n <= array[lastIndex] && firstIndex <= lastIndex) {
            int m = firstIndex + (lastIndex - firstIndex) * (n - array[firstIndex]) / (array[lastIndex] - array[firstIndex]);
            if (lastIndex == firstIndex) {
                if (array[firstIndex] == n) {
                    return firstIndex;
                } else {
                    return -1;
                }
            }
            if (array[m] == n) {
                return m;
            }
            if (array[m] < n) {
                firstIndex = m + 1;
            } else {
                lastIndex = m - 1;
            }
        }

        return -1;
    }

}
