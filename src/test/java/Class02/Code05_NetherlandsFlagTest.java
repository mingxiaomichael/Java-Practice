package Class02;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code05_NetherlandsFlagTest {

    @Test
    public void netherlandsFlag() {
        int len = (int)(20 * Math.random());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int)(100 * Math.random());
        }
        int num = arr[(int)((len-1)*Math.random())];
        System.out.println(Arrays.toString(arr));
        System.out.println(num);
        Code05_NetherlandsFlag.netherlandsFlag(arr, num);
        System.out.println(Arrays.toString(arr));
    }
}