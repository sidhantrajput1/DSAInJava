package Queue;

public class CircularQueueArray {
    public static class Circular {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val) throws Exception{
            if (size == arr.length) {
                throw new Error("Queue is Full");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if(rear < arr.length-1){
                arr[rear + 1] = val;
                rear++;
            } else if(rear == arr.length) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is full");
            } else {
                int val = arr[front];
                if (front == arr.length ) {
                    front = 0;
                } else front++;
                return val;
            }
        }

        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is full");
            } else {
               return arr[front];
            }
        }

        public void display()throws Exception {
            if (size == 0) {
                throw new Exception("Queue is full");
            } else if(front <=  rear) {
                for(int i = front ; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            } else {
                for(int i = front ; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0 ; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        Circular c = new Circular();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        c.display();
    }
}
