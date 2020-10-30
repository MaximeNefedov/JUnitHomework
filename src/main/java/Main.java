public class Main {
    public static void main(String[] args) {
        /// В ходе выполнения работы я не смог выбрать какое-то конкретное ДЗ для демонстрации работы JUnit.
        /// Поэтому я решил продемонстрировать работу тестирования на данном примере:
        /// Пусть изначально было принято решение отсортировать некий объем целочисленных значений
        /// соритровкой пузырька (Алгоритмическая сложность: O(n^2)). Однако увеличив количество данных до 100 000 ед. было выявлено,
        /// что программа работает очень долго (в данном примере было затрачено 17552 миллисекунд).
        /// Создав метод arrayQuickSort, реализующий быструю сортировку с алгоритмической сложностью (O(n×log2n) (ср. значение)),
        /// была существенно увеличина скорость работы программы
        /// В качестве критерия при тестировании будет использовано значение: 200 миллисекунд
        //long startTime = System.currentTimeMillis();

        SorterService quickSorter = new SorterService();
        SorterService bubbleSorter = new SorterService();

        quickSorter.fillArray(100_000);
        quickSorter.calculateQuickSortTime();
        //quickSorter.showSortedArray();

        bubbleSorter.fillArray(100_000);
        bubbleSorter.calculateBubbleSortTime();
        //bubbleSorter.showSortedArray();

        System.out.println("Программа 1 выполнялась: " + quickSorter.getTimeSpent() + " миллисекунд");
        System.out.println("Программа 2 выполнялась: " + bubbleSorter.getTimeSpent() + " миллисекунд");


    }
}
