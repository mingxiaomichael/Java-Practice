package Class02;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code04_SortArrayDistanceLessKTest {

    @Test
    public void sortedArrDistanceLessK() {
        int[] arr = {8, 5, 3, 9, 2, 7};
        int k = 4;
        Code04_SortArrayDistanceLessK.sortedArrDistanceLessK(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}