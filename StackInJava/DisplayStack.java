package StackInJava;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(3);
        st.push(8);
        st.push(10);
        st.push(12);

        System.out.println(st);

        int n = st.size();
        int[] arr = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
