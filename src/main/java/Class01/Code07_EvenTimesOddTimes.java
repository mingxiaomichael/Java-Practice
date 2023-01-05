package Class01;

/*
    an integer array,
    1) a number occurs odd times, other numbers occur even times;
    2) two numbers occur odd times, other numbers occur even times.
    time complexity: O(N)
    space complexity: O(1)
 */

/*
    the properties of exclusive OR:
    1) same -> 0, difference -> 1;
    2) distributive law and associative law;
    3) the result of a number XOR with 0 is the number itself.
 */

public class Code07_EvenTimesOddTimes {
    public static void printOddTimesNum1(int[] arr){
        int eor = 0;
        for(int i : arr){
            eor ^= i;
        }
        System.out.println(eor);
    }

    public static void printEvenTimesNum2(int[] arr){
        //arr has a and b, only a and b occurs odd times
        int eor = 0, eor1 = 0;
        for(int i : arr){
            eor ^= i;  //a ^ b
        }
        int rightOne = (~eor + 1) & eor;
        for (int j : arr) {
            // "== 0" or "== rightOne"
            if ((j & rightOne) == 0) {
                eor1 ^= j;
            }
        }
        System.out.println(eor1 + " " + (eor ^ eor1));
    }
}
