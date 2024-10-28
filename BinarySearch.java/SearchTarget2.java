
import java.util.*;

public class SearchTarget2 {
    static boolean search(int[] arr, int target) {
        Arrays.sort(arr);

        int st = 0;
        int end = arr.length - 1;

        while(st <= end) {

            int mid = st + (end - st) / 2;

            if(target == arr[mid]) {
                return true;
            } else if (target <= arr[mid]) {
                end = mid - 1; 
            } else {
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 2,5,6,0,0,1,2};
        int target = 0;


        boolean result = search(arr, target);
        System.err.println(result);
    }
}
