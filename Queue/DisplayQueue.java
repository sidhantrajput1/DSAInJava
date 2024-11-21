package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        // rear -> 50 40 30 20 10 -> front
        // display the queue
        Queue<Integer> helper = new ArrayDeque<>();
        while (q.size() > 0) {
            System.out.print(q.peek()+" ");
            int x = q.poll();
            helper.add(x);
        }
        while (helper.size() > 0) {
            q.add(helper.poll());
        }
    }
}
