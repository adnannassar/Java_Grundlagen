package Arrays.OneDimArray.LösungAufgabe003;

import Arrays.OneDimArray.OneDimArray;

public class Merge {
    public static void main(String[] args) {
        int[] a = {1, 3, 7};
        int[] b = {2, 4};
        OneDimArray.printArray("a", a);
        OneDimArray.printArray("b", b);
        OneDimArray.printArray("Merged", merge(a, b));

    }

    public static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < merged.length; i++) {
            if (aIndex >= a.length) {
                merged[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                merged[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                merged[i] = a[aIndex];
                aIndex++;
            } else {
                merged[i] = b[bIndex];
                bIndex++;
            }
        }
        return merged;
    }

}
