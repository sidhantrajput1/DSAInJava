package Stack;

import java.util.Stack;

public class NextGreaterElement {
    static int[] nextgreter(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int  i = n - 1; i >= 0; i-- ) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] result =  nextgreter(arr);
        System.out.print("Array is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Next greate : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        
    }
}

// Next Greater Element
// 1 3 2 1 8 6 3 4
// 3 8 8 8 -1 -1 4 -1


/* 
 * 
       int[] res = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++) {
            res[i] = -1;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            } 
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
 */