import org.junit.jupiter.api.*;

public class SorterServiceTest {

    // Добавление метода arrayQuickSort в классе Sorter позволило выполнить тест, в ходе которого
    // максимальное время выполнения задачи равно 100 миллисекундам
    // Для наглядности тест bubbleSortTimeTest пройден не будет

    private static final long CURRENT_TIME = 200L;
    private static final int arraySize = 100_000;
    private static final int unvalidatedValue = - 1;
    private static boolean timeCorrected = false;
    private SorterService service;

    @BeforeEach
    public void createService() {
        service = new SorterService();
    }

    @Test
    public void methodShouldThrowNPE() {
        Assertions.assertThrows(NegativeArraySizeException.class, () -> service.fillArray(unvalidatedValue));
    }

    @Test
    public void quickSortMethodShouldThrowExc() {
        service.fillArray(arraySize);
        Sorter sorter = new Sorter();
        int[] testedArray = new int[5];

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> sorter.arrayQuickSort(testedArray, unvalidatedValue, testedArray.length));
    }

    /// Демонстрация ситуации, когда сортировка пузырька не пройдет тест
    @Test
    public void quickSortTimeTest() {
        service.fillArray(arraySize);
        service.calculateQuickSortTime();
        if (service.getTimeSpent() <= CURRENT_TIME) {
            timeCorrected = true;
        }
        Assertions.assertTrue(timeCorrected);
    }

    @Test
    public void bubbleSortTimeTest() {
        service.fillArray(arraySize);
        service.calculateBubbleSortTime();
        if (service.getTimeSpent() <= CURRENT_TIME) {
            timeCorrected = true;
        }
        Assertions.assertTrue(timeCorrected);
    }
}
