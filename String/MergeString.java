package String;

public class MergeString {
    static String merge(String str, String st) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < str.length() || i < st.length(); i++) {
            if(i < str.length()) {
                result.append(str.charAt(i));
            }
            if(i < st.length()) {
                result.append(st.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        
        String str = "geeks";
        String st = "forgeeks";
        // String result =  merge(str, st);
        System.out.println(merge(str, st));
    }
}
