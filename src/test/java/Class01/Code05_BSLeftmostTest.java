package Class01;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code05_BSLeftmostTest {

    @Test
    public void nearestIndex() {
        int len = (int)(20 * Math.random());
        int[] sortedArr = new int[len];
        for(int i = 0; i < len; i++){
            sortedArr[i] = (int)(100 * Math.random());
        }
        Arrays.sort(sortedArr);
        int num =  (int)(100 * Math.random());
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
        System.out.println("The number is: " + num);
        System.out.println(Code05_BSLeftmost.nearestIndex(sortedArr, num));
    }
}