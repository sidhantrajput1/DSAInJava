package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> a = new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        // System.out.println(a);
        // a.poll();
        // System.out.println(a);
        // a.remove();
        // System.out.println(a);
        // System.out.println(a.element());
        // System.out.println(a.peek());

        Queue<Integer> help = new LinkedList<>();
        while(a.size() > 0) {
            System.out.print(a.peek()+" ");
            int x = a.poll();
            help.add(x);
        }
        while(help.size() > 0){
            a.add(help.poll());
        }

        // System.out.println(5>0);

        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // System.out.println(q);
        // System.out.println("Size of Queue is : "+q.size());
        // q.remove();
        // System.out.println(q);
        // q.poll();
        // System.out.println(q);
        // System.out.println(q.element());
    }
}
