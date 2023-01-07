package Class01;

public class Code06_RecursionOrderN {
    public static int recursionOrderN(int[] arr, int L, int R){
        if(L == R){
            return arr[L];
        }
        int mid = L + (R - L) / 2;
        int LMax = recursionOrderN(arr, L, mid);
        int RMax = recursionOrderN(arr, mid + 1, R);
        return Math.max(LMax, RMax);
    }
}
