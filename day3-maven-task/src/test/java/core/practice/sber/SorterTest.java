package core.practice.sber;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.MethodSource;

public class SorterTest {
    static Stream<int[]> testArrays() {
        return Stream.of(
                new int[]{5, 3, 8, 1, 9, 2},
                new int[]{1},
                new int[]{},
                new int[]{2, 2, 2, 2},
                new int[]{-5, 10, -3, 0, 7},
                new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1},
                new int[]{1, 2, 3, 4, 5}
        );
    }

    @Test
    void bubbleSort_unsortedArray_sortsCorrectly() {
        int[] arr = {5, 3, 8, 1, 9, 2};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8, 9}, arr);
    }

    @Test
    void bubbleSort_emptyArray_staysEmpty() {
        int[] arr = {};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void bubbleSort_singleElement_unchanged() {
        int[] arr = {42};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void bubbleSort_alreadySorted_staysUnchanged() {
        int[] arr = {1, 2, 3, 4, 5};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void bubbleSort_reverseSorted_sortsCorrectly() {
        int[] arr = {9, 8, 7, 6, 5};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, arr);
    }

    @Test
    void bubbleSort_withDuplicates_sortsCorrectly() {
        int[] arr = {4, 2, 4, 1, 2};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4}, arr);
    }

    @Test
    void bubbleSort_withNegativeNumbers_sortsCorrectly() {
        int[] arr = {-5, 10, -3, 0, 7};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{-5, -3, 0, 7, 10}, arr);
    }

    @Test
    void quickSort_unsortedArray_sortsCorrectly() {
        int[] arr = {5, 3, 8, 1, 9, 2};
        Sorter.quickSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8, 9}, arr);
    }

    @Test
    void quickSort_emptyArray_staysEmpty() {
        int[] arr = {};
        Sorter.quickSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void quickSort_singleElement_unchanged() {
        int[] arr = {42};
        Sorter.quickSort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void quickSort_alreadySorted_staysUnchanged() {
        int[] arr = {1, 2, 3, 4, 5};
        Sorter.quickSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void quickSort_reverseSorted_sortsCorrectly() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Sorter.quickSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    @Test
    void quickSort_withDuplicates_sortsCorrectly() {
        int[] arr = {4, 2, 4, 1, 2};
        Sorter.quickSort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4}, arr);
    }

    @Test
    void quickSort_withNegativeNumbers_sortsCorrectly() {
        int[] arr = {-5, 10, -3, 0, 7};
        Sorter.quickSort(arr);
        assertArrayEquals(new int[]{-5, -3, 0, 7, 10}, arr);
    }

    @ParameterizedTest
    @MethodSource("testArrays")
    void bubbleSortAndQuickSort_produceSameResult(int[] original) {
        int[] arrBubble = original.clone();
        int[] arrQuick = original.clone();

        Sorter.bubbleSort(arrBubble);
        Sorter.quickSort(arrQuick);

        assertArrayEquals(arrBubble, arrQuick);
    }
}
