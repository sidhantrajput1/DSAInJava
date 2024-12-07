package Queue;


public class LinkedListImplementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class QueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add (int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } 
            return head.data;
        } 

        public int remove() {
            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } 
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
        
        void display() {
            if(size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueLL ll = new QueueLL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(7);

        ll.display();

        ll.remove();
        ll.display();

        System.out.println(ll.peek());
    }
}
