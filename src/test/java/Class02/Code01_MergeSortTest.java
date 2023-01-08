package Class02;

import Class01.Code06_RecursionOrderN;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Code01_MergeSortTest {

    @Test
    public void mergeSort() {
        int len = (int)(20 * Math.random());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int)(100 * Math.random());
        }
        System.out.println(Arrays.toString(arr));
        int[] arr1 = arr;
        Arrays.sort(arr1);
        Code01_MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr == arr1);
    }
}