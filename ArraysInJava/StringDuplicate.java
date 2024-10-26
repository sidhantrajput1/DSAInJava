package ArraysInJava;

public class StringDuplicate {
    static void duplicate(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j) {
                    System.out.print((char)arr[i]+" ");
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {'a', 'b', 'c', 'a', 'e', 'd', 'c'};
        duplicate(arr);
    }
}
