package StackInJava;

import java.util.Scanner;
import java.util.Stack;
// Move stack in same order on antoher stack
public class CopyStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int n ;
        System.out.println("Enter the number elements you want to insert : ");
        n = sc.nextInt();
        System.out.println("Enter the number element : ");

        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
