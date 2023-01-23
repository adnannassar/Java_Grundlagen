package Advanced.Sorting;

public class CompareationClass {
    private final static int size = 10000;

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        BubbleSort.bubbleSort(ArrayTools.fillOneDimArrayWithRandoms(size));
        stopWatch.stop();
        System.out.println("Bubble Sort, Time: " + stopWatch.getDuration() / 1000 + " ms");


        stopWatch.start();
        SelectionSort.selectionSort(ArrayTools.fillOneDimArrayWithRandoms(size));
        stopWatch.stop();
        System.out.println("Selection Sort, Time: " + stopWatch.getDuration() / 1000 + " ms");


        stopWatch.start();
        InsertionSort.insertionSort(ArrayTools.fillOneDimArrayWithRandoms(size));
        stopWatch.stop();
        System.out.println("Insertion Sort, Time: " + stopWatch.getDuration() / 1000 + " ms");


        stopWatch.start();
        new MergeSort(ArrayTools.fillOneDimArrayWithRandoms(size));
        stopWatch.stop();
        System.out.println("Merge Sort, Time: " + stopWatch.getDuration() / 1000 + " ms");


        stopWatch.start();
        QuickSort.quickSort(ArrayTools.fillOneDimArrayWithRandoms(size), 0, size - 1);
        stopWatch.stop();
        System.out.println("Quick Sort, Time: " + stopWatch.getDuration() / 1000 + " ms");


        stopWatch.start();
        HeapSort.heapSort(ArrayTools.fillOneDimArrayWithRandoms(size));
        stopWatch.stop();
        System.out.println("Heap Sort, Time: " + stopWatch.getDuration() / 1000 + " ms");
    }
}
