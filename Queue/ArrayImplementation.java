package Queue;

public class ArrayImplementation {
    public static class QueueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];
        public void add(int val) {
            if (r==arr.length-1) {
                System.out.print("Queue is full!");
                return;
            }
            if(f==-1) {
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[++r] = val;
            }
            size++;
        }
        public int remove() {
            int x = arr[f];
            f++;
            size--;
            return x;
        }
        public int peek() {
            if (size==0) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public void display() {
            if (size == 0) {
                System.out.print("Queue is Empty");
            }
            else {
                for(int i = f; i <= r; i++){
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
        q.display();
    }
}
