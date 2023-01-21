package Advanced.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 15, 16, 17, 20, 200, 1000, 1001, 1005, 5000};
        int n = 1001;
        System.out.println("Searchring Iterative for " + n + ": " + binarySearchIterativeBoolean(array, n, 0, 9));
        System.out.println("Index Iterative of " + n + ": " + binarySearchIterativeIndex(array, n, 0, 9));


        System.out.println("Searchring Recursive for " + n + ": " + binarySearchRecursiveIndex(array, n, 0, 9));
        System.out.println("Index Recursive of " + n + ": " + binarySearchRecursiveBoolean(array, n, 0, 9));
    }

    public static int binarySearchIterativeIndex(int[] sortedArray, int number, int fIndex, int lIndex) {
        int index = 0;
        while (fIndex <= lIndex) {
            int m = fIndex + ((lIndex - fIndex) / 2);
            if (sortedArray[m] < number) {
                fIndex = m + 1;
            } else if (sortedArray[m] > number) {
                lIndex = m - 1;
            } else if (sortedArray[m] == number) {
                index = m;
                break;
            }
        }
        return index;
    }

    public static int binarySearchRecursiveIndex(int[] sortedArray, int number, int fIndex, int lIndex) {
        int m = fIndex + ((lIndex - fIndex) / 2);
        if (lIndex < fIndex) {
            return -1;
        }
        if (sortedArray[m] == number) {
            return m;
        } else if (sortedArray[m] < number) {
            return binarySearchRecursiveIndex(sortedArray, number, m + 1, lIndex);
        }else{
            return binarySearchRecursiveIndex(sortedArray, number, fIndex, m-1);
        }
    }

    public static boolean binarySearchRecursiveBoolean(int[] sortedArray, int number, int fIndex, int lIndex) {
        int m = fIndex + ((lIndex - fIndex) / 2);
        if (lIndex < fIndex) {
            return false;
        }
        if (sortedArray[m] == number) {
            return true;
        } else if (sortedArray[m] < number) {
            return binarySearchRecursiveBoolean(sortedArray, number, m + 1, lIndex);
        }else{
            return binarySearchRecursiveBoolean(sortedArray, number, fIndex, m-1);
        }
    }

    public static boolean binarySearchIterativeBoolean(int[] sortedArray, int number, int fIndex, int lIndex) {
        while (fIndex <= lIndex) {
            int m = fIndex + ((lIndex - fIndex) / 2);
            if (sortedArray[m] < number) {
                fIndex = m + 1;
            } else if (sortedArray[m] > number) {
                lIndex = m - 1;
            } else if (sortedArray[m] == number) {
                return true;
            }
        }
        return false;
    }
}
