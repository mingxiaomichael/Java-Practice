package Class01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code07_EvenTimesOddTimesTest {
    int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
    int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
    @Test
    public void printOddTimesNum1() {
        System.out.println("printOddTimesNum1: ");
        Code07_EvenTimesOddTimes.printOddTimesNum1(arr1);
    }

    @Test
    public void printEvenTimesNum2() {
        System.out.println("printEvenTimesNum2: ");
        Code07_EvenTimesOddTimes.printEvenTimesNum2(arr2);
    }
}