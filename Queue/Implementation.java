package Queue;
// import java.util.*;

public class Implementation {
    // Queue Implementation using Array
    public static class QueueA {
        int f = -1;
        int r  = -1;
        int size = 0;
        int[] arr = new int[100];

        // add()
        void add (int val) {
            if(r==arr.length-1) {
                System.out.println("Queue is full");
                return;
            }

            if(f == -1) {
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[r+1] = val;
                r++;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1 ;
            }
            int x = arr[f];
            f++;
            size--; 
            return x ;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1 ;
            }
            int x = arr[f];
            return x;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                for(int i = f ; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
