package ArraysInJava;

public class PrintGrid {
    
    public static void main(String[] args) {
        int[][] arr = new int[8][10];

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 10; j++) {
                System.err.print(" "+ arr[i][j]);
            }
            System.err.println();
        }
    }
}
