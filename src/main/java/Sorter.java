public class Sorter {

    public int[] arrayQuickSort(int[] inputArray, int start, int end) {

        if (start >= end) {
            return inputArray;
        }

        int i = start;
        int j = end;
        int middleElement = i - (i - j) / 2;

        while (i < j) {
            while ((i < middleElement) && (inputArray[i] <= inputArray[middleElement])) {
                i++;
            }
            while ((middleElement < j) && (inputArray[middleElement] <= inputArray[j])) {
                j--;
            }
            if (i < j) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
            if (i == middleElement) {
                middleElement = j;
            } else if (j == middleElement) {
                middleElement = i;
            }

        }
        arrayQuickSort(inputArray, start, middleElement);
        arrayQuickSort(inputArray, middleElement + 1, end);
        return inputArray;
    }

    public int[] arrayBubbleSort(int[] inputArray) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i - 1] > inputArray[i]) {
                    int temp = inputArray[i - 1];
                    inputArray[i - 1] = inputArray[i];
                    inputArray[i] = temp;
                    sorted = false;
                }
            }
        }
        return inputArray;
    }
}
