package Class01;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code03_InsertionSortTest {

    int[] arr = {659, 2, 34, 90, 109, 78, 29};
    int[] arr1 = {78, 29};
    int a = 0;
    int b = 1;

    @Test
    public void insertionSort() {
        Code03_InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void swap() {
        Code03_InsertionSort.swap(arr1, a, b);
        System.out.println(Arrays.toString(arr1));
    }
}