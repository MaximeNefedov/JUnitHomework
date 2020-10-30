import java.util.Random;

public class SorterService {
    private long timeSpent = 0;
    private int[] unsortedArray;
    private int[] sortedArray;

    public void fillArray(int size) {
        Random random = new Random();
        unsortedArray = new int[size];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(100);
        }
    }

    public long getTimeSpent() {
        return timeSpent;
    }

    public void calculateQuickSortTime() {
        long startTime = System.currentTimeMillis();
        Sorter quickSorter = new Sorter();
        sortedArray = quickSorter.arrayQuickSort(unsortedArray, 0, unsortedArray.length - 1);
        timeSpent = System.currentTimeMillis() - startTime;
    }

    public void calculateBubbleSortTime() {
        long startTime = System.currentTimeMillis();
        Sorter bubbleSorter = new Sorter();
        sortedArray = bubbleSorter.arrayBubbleSort(unsortedArray);
        timeSpent = System.currentTimeMillis() - startTime;
    }

    public void showSortedArray() {
        for (int i = 0; i < sortedArray.length; i++) {
            if (i == sortedArray.length - 1) {
                System.out.print(sortedArray[i] + "\n");
            } else {
                System.out.print(sortedArray[i] + " ");
            }
        }
    }
}
