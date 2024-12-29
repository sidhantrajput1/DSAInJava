// find the first occurence of a given element x. given that the given array is sorted. if no occurence of x os found them return -1.
// arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9}; target = 5
// output - 1


public class FirstOccurence {
    static int firstOccurence(int[] arr, int target) {
        int st = 0; 
        int end = arr.length - 1;
        int fo = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target) {
                fo = mid;
                end = mid - 1;
            } else if( arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 5, 6, 6, 8, 9, 9, 9}; 
        int target = 5;
        int result = firstOccurence(arr, target);
        System.out.println(result);
    }
}
