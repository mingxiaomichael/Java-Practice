package Class01;

/*
    Bubble Sort
    Time Complexity: O(N^2)
    Additional Space Complexity: O(1)
 */

public class Code02_BubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        //XOR method
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

}
