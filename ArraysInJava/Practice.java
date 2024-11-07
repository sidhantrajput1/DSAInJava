package ArraysInJava;

public class Practice {
    static int largest(int[] arr) {
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(mx < arr[i]) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int SecondLargest(int[] arr) {
        int max = largest(arr);

        for(int i = 0; i < arr.length; i++) {
            if(max == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int smax = largest(arr);
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for(int num : arr) {
            System.out.print(num+" ");
        }

        System.out.println();

        int ans = SecondLargest(arr);
        System.out.println(ans);
    }
}
