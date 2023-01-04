package Class01;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code02_BubbleSortTest {

    int[] arr = {65, 2, 34, 90, 78, 29};
    int[] arr1 = {78, 29};
    int a = 0;
    int b = 1;

    @Test
    public void bubbleSort() {
        Code02_BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void swap() {
        Code01_SelectionSort.swap(arr1, a, b);
        System.out.println(Arrays.toString(arr1));
    }
}