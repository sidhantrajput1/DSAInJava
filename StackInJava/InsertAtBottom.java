package StackInJava;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(3);
        st.push(8);
        st.push(10);
        st.push(12);

        System.out.println(st);

        int idx = 2;
        int x = 6;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx) {
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0) {
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
