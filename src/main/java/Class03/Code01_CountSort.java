package Class03;

/*
    Count Sort
    Time Complexity: O(n + k)
    Space Complexity: O(k)
    Limited by data status
 */

public class Code01_CountSort {
    //the value is Positive Integer
    public static void countSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        // find the max value
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        // counting
        int[] bucket = new int[max + 1];
        for(int i = 0; i < arr.length; i++){
            bucket[arr[i]]++;
        }
        int i = 0;
        for(int j = 0; j < bucket.length; j++){
            while(bucket[j] > 0){
                arr[i] = j;
                i++;
                bucket[j]--;
            }
        }
    }
}
