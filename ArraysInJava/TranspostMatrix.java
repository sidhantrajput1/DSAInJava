package ArraysInJava;

import java.util.*;

public class TranspostMatrix {

    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
    }
    
    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    static void transpostInPlace(int[][] matrix, int r, int c) {

        if (r != c) {
            return;
        }

        for(int i = 0; i < r; i++) {
            for(int j = i + 1; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and col of matrix  ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] matrix = new int[r][c];

        // take input
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }                    
        }

        System.out.println("Input matrix ");
        printMatrix(matrix);

        transpostInPlace(matrix, r, c);
        System.out.println("Transposed matrix:");
        printMatrix(matrix);

        sc.close();
    }
}
