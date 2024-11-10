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
        Stack<Integer> rt = new Stack<>(); 

        // while (st.size() > 0) {
        //     int x =  st.peek();
        //     rt.push(x);
        //     st.pop();
        // }

        while (st.size() > 0) {
            rt.push(st.pop());
        }

        System.out.println(rt);
        // System.out.println(st);

        // copy the element
        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0) {
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
