package Class02;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code06_QuickSortTest {

    @Test
    public void quickSort() {
        int len = (int)(20 * Math.random());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int)(100 * Math.random());
        }
        int[] arr1 = arr;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        Code06_QuickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr1 == arr);
    }
}