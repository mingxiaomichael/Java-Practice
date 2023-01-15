package Class03;

import Class02.Code06_QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code01_CountSortTest {

    @Test
    public void countSort() {
        int len = (int)(20 * Math.random());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int)(100 * Math.random());
        }
        System.out.println(Arrays.toString(arr));
        Code01_CountSort.countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}