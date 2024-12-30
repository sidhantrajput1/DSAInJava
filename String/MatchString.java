package String;

public class MatchString {
    static int matchString(String str, String st) {
        for(int i = 0 ; i < str.length() - st.length() + 1; i++) {
            if(str.charAt(i) == st.charAt(0)) {
                if(str.substring(i, st.length() + i).equals(st)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "trtbutsad";
        String st = "sad";
        int result = matchString(str, st);
        System.out.println(result);
    }
}
