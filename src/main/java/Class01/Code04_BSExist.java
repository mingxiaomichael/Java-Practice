package Class01;

/*
    Binary Search
    Whether a number exists in a sorted array
 */

public class Code04_BSExist {
    public static boolean exist(int[] sortedArr, int num){
        if(sortedArr == null || sortedArr.length == 0){
            return false;
        }
        int L = 0;
        int R = sortedArr.length - 1;
        int mid = 0;
        while(L < R){
            mid = (L + (R - L)) / 2;
            if(sortedArr[mid] == num){
                return true;
            }else if(sortedArr[mid] > num){
                R = mid - 1;
            }else{
                L = mid + 1;
            }
        }
        return sortedArr[L] == num;
    }
}
