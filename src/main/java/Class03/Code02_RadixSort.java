//package Class03;
//
///*
//    RadixSort
// */
//
//public class Code02_RadixSort {
//    public static void radixSort(int[] arr){
//        if(arr == null || arr.length < 2){
//            return;
//        }
//        radixSort(arr, 0, arr.length - 1, maxBits(arr));
//    }
//
//    public static int maxBits(int[] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){
//            max = Math.max(max, arr[i]);
//        }
//        int res = 0;
//        while(max != 0){
//            res++;
//            max /= 10;
//        }
//        return res;
//    }
//
//    public static void radixSort(int[] arr, int begin, int end, int digit){
//        final int radix = 10;
//        int i = 0, j = 0;
//        int[] bucket = new int[end - begin + 1];
//        for(int d = 1; d <= digit; d++){
//            int[] count = new int[radix];
//            for(i = begin; i <= end; i++){
//                j = getDigit(arr[i], d);
//                count[j]++;
//            }
//            for(i = 1; i < radix; i++){
//                count[i] = count[i] + count[i - 1];
//            }
//            for(i = end; i >= begin; i--){
//                j = getDigit(arr[i], d);
//                bucket[count[j] - 1] = arr[i];
//                count[j]--;
//            }
//            for(i = begin, j = 0; i <= end; i++, j--){
//                arr[i] = bucket[j];
//            }
//        }
//    }
//
//    public static int getDigit(int x, int d){
//        return ((x / ((int)Math.pow(10, d - 1))) % 10);
//    }
//
//}

package Class03;

import java.util.Arrays;

public class Code02_RadixSort {

    // only for no-negative value
    public static void radixSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        radixSort(arr, 0, arr.length - 1, maxbits(arr));
    }

    public static int maxbits(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int res = 0;
        while (max != 0) {
            res++;
            max /= 10;
        }
        return res;
    }

    public static void radixSort(int[] arr, int begin, int end, int digit) {
        final int radix = 10;
        int i = 0, j = 0;

        int[] bucket = new int[end - begin + 1];
        for (int d = 1; d <= digit; d++) {
            int[] count = new int[radix];
            for (i = begin; i <= end; i++) {
                j = getDigit(arr[i], d);
                count[j]++;
            }
            for (i = 1; i < radix; i++) {
                count[i] = count[i] + count[i - 1];
            }
            for (i = end; i >= begin; i--) {
                j = getDigit(arr[i], d);
                bucket[count[j] - 1] = arr[i];
                count[j]--;
            }
            for (i = begin, j = 0; i <= end; i++, j++) {
                arr[i] = bucket[j];
            }
        }
    }

    public static int getDigit(int x, int d) {
        return ((x / ((int) Math.pow(10, d - 1))) % 10);
    }

}

