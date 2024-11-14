package Stack;
import java.util.*;
public class BalancedBracket {
    // Check whether a given bracket sequence is balanced or not !!
    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch=='(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else { // ch == ')'
                if (st.size()==0) return false;
                int top = st.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || ( ch == ']' && top != '[' )) return false;
            }
        }
        if(st.size() > 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
