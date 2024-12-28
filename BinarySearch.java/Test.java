public class Test {
    // Given a sorted array & a target, find whether target exist in an array
    // arr = {5, 8, 10, 13, 15};,target = 13;
    static boolean findTarget(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end--;
            } else {
                st++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5, 8, 10, 13, 15};
        int target = 13;
        boolean ans = findTarget(arr, target);
        System.out.println(ans);
    }
}
