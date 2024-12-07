package Stack;

import java.util.Stack;

public class IsBalanced {
    static boolean isBalnced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if(st.size() == 0) return false;
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        if (st.size() > 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        String str = "())";
        System.out.println(isBalnced(str));
    }
}