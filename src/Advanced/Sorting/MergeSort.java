package Advanced.Sorting;


public class MergeSort {


    public int[] array;
    public int[] tempArray;

    public MergeSort(int[] array) {
        prepareForSort(array);
    }


    public void prepareForSort(int[] array) {
        this.array = array;
        this.tempArray = new int[array.length];
        doMergeSort(0, array.length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        // verteilungsphase
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // from first index to middle
            doMergeSort(lowerIndex, middle);
            // from middle + 1 to the last index
            doMergeSort(middle + 1, higherIndex);

            // mergePhase
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }

    }
}
