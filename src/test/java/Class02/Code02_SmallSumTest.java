package Class02;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code02_SmallSumTest {

    @Test
    public void smallSum() {
        int[] arr = {1,3,4,2,5};
        System.out.println(Code02_SmallSum.smallSum(arr));
    }
}