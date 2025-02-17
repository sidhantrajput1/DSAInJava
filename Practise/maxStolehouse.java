package Practise;

public class maxStolehouse {
    static int maxStoleHouse(int[] arr, int n) {
        if(n <= 0) return 0;

        if(n == 1) return arr[0];

        int pick = arr[n - 1] + maxStoleHouse(arr, n-2);
        int notPick = maxStoleHouse(arr, n-1);

        return Math.max(pick, notPick);
    }
    static int maxLoot(int[] arr) {
        int n = arr.length;
        return maxStoleHouse(arr, n);
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};
        System.out.println(maxLoot(arr));
    }
}
