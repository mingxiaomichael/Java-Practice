package Class01;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code06_RecursionOrderNTest {

    @Test
    public void recursionOrderN() {
        int len = (int)(20 * Math.random());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int)(100 * Math.random());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Code06_RecursionOrderN.recursionOrderN(arr, 0, arr.length - 1));
    }
}