package StackInJava;

import java.util.Stack;
// Move stack in same order on antoher stack
public class CopyStack {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // Reverse Order
        Stack<Integer> gt = new Stack<>();
        // while (st.size() > 0) {
        //     int x = st.peek();
        //     rt.push(x);
        //     st.pop();
        // }

        while (st.size() > 0)  {
            gt.push(st.pop());
        }

        Stack<Integer> rt = new Stack<>();

        while (gt.size() > 0) {
            rt.push(gt.pop());
        }

        System.out.println(rt);

        // int n ;
        // System.out.println("Enter the number elements you want to insert : ");
        // n = sc.nextInt();
        // System.out.println("Enter the number element : ");

        // for(int i = 1; i <= n; i++) {
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);
    }
}
