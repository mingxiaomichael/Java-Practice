package Class01;

/*
    Selection Sort
    Time Complexity: O(N^2)
    Additional Space Complexity: O(1)
 */

public class Code01_SelectionSort {
    public static void selectionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i; j < arr.length; j++){
                minIndex = arr[minIndex] < arr[j] ? minIndex : j;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}