package Class03;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code02_RadixSortTest {

    @Test
    public void radixSort() {
        int len = (int)(20 * Math.random());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int)(100 * Math.random());
        }
        System.out.println(Arrays.toString(arr));
        Code02_RadixSort.radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}