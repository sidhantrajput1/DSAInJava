package StackInJava;
import java.util.*;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // push for add value in stack
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        // Peak for find the value of stack
        System.err.println(st.peek());

        System.err.println(st);

        st.pop();

        System.err.println(st);
        System.err.println("Size is : "+st.size());
    }
}
