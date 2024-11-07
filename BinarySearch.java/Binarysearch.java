
public class Binarysearch {
    static Boolean search(int[] arr, int target) {
        int st = 0; 
        int end = arr.length - 1;

        while(st <= end) {
            int mid = st + (end - st)/2;

            if(arr[mid] == target) {
                return true;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid  + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 8, 9, 12};
        int target = 9;

        Boolean result = search(arr, target);
        System.out.println(result);
    }
}
