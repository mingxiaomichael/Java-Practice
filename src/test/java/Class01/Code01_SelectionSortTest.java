package Class01;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code01_SelectionSortTest {

    int[] arr = {65, 12, 34, 90, 78, 29};
    int[] arr1 = {65, 12};
    int a = 0;
    int b = 1;

    @Test
    public void selectionSort() {
        Code01_SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void swap() {
        Code01_SelectionSort.swap(arr1, a, b);
        System.out.println(Arrays.toString(arr1));
    }
}