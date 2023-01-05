package Class01;

/*
    Insertion Sort
    Time Complexity: O(N^2)
    Additional Space Complexity: O(1)
 */

public class Code03_InsertionSort {
    public static void insertionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--){
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}
