package Class02;

public class Code05_NetherlandsFlag {
    public static void netherlandsFlag(int[] arr, int num){
        int smaller = -1;
        int bigger = arr.length;
        for(int i = 0; i < bigger;){
            if(arr[i] <= num){
                swap(arr, i++, ++smaller);
            }else if(arr[i] == num){
                i++;
            }else{
                swap(arr, i, --bigger);
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
