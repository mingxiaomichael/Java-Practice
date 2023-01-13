package Class02;

/*
    Heap Sort:
    Time Complexity: O(N*LogN)
    Space Complexity: O(1)
    Heap add / delete, time complexity O(logN)
 */

public class Code03_HeapSort {
    public static void heapSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
//        for(int i = 0; i < arr.length; i++){
//            heapInsert(arr, i);
//        }
        //Improve O(N)
        for(int i = arr.length - 1; i >= 0; i--){
            heapify(arr, i, arr.length);
        }
        int heapSize = arr.length;
        while(heapSize > 1) {
            swap(arr, 0, --heapSize);
            heapify(arr, 0, heapSize);
        }
    }

    public static void heapInsert(int[] arr, int index){
        while(arr[index] > arr[(index - 1) / 2]){
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] arr, int index, int heapSize){
        int left = index * 2 + 1;
        while(left < heapSize){
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if(largest == index){
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
