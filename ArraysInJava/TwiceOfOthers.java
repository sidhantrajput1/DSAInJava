package ArraysInJava;

public class TwiceOfOthers {
    

    static int dominantIndex(int[] arr) {

        int max = -1;
        int smax = -1;
        int mxIdx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                smax = max;
                max = arr[i];
                mxIdx = i;
            } else if (smax < arr[i]) {
                smax = arr[i];
            }
        }

        if(smax * 2 <= max) {
            return mxIdx;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,0};

        int result = dominantIndex(arr);
        System.err.println(result);
    }
}
