package StackInJava;

import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5); // [1, 2, 3, 4, 5]

        System.out.println(st); // [1, 2, 3, 4, 5]

        // System.out.println(st.peek()); // The element at the top of the stack is: 5
        // System.out.println(st.pop()); // Popped element: 5
        
        // print in reverse order
        int idx = 2;
        int x = 44;
        Stack<Integer> rt = new Stack<>(); 
        while (st.size() > idx) {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
