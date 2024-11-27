package Stack;


// find the minimum of bracket that we need to make it given bracket sequence is balanced
public class MinBracket {
    public  static int minBracket(String str) {
        // Stack<Character> st = new Stack<>();
        int n = str.length();
        
        int balanced = 0;
        int additions = 0;
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                balanced++;
            } else if (ch == ')') {
                if (balanced > 0) {
                    balanced--;
                } else {
                    additions++;
                }
            }
        }

        return balanced + additions;
    }
    public static void main(String[] args) {
        String str = "())(";
        System.out.println(minBracket(str));
    }
}
