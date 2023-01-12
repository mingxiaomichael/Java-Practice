package Class02;

/*
    Quick Sort:
    Time Complexity: O(N*logN)
    Space Complexity: O(logN)
 */

public class Code06_QuickSort {
    public static void quickSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int l, int r){
        if(l < r){
            swap(arr, l + ((int)(Math.random() * (r - l + 1))), r);
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }
    }

    public static int[] partition(int[] arr, int l, int r){
        int smaller = l - 1;
        int larger = r;
        while(l < larger){
            if(arr[l] < arr[r]){
                swap(arr, ++smaller, l++);
            }else if(arr[l] > arr[r]){
                swap(arr, --larger, l);
            }else{
                l++;
            }
        }
        swap(arr, r, larger);
        return new int[] {smaller + 1, larger};
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
