package Queue;

public class Implement {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Queue {
        Node head = null;
        int size = 0;
        Node tail = null;
        void add(int data) {
            Node temp = new Node(data);
            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
        int peek() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return -1 ;
            }
            return head.data;
        }
        boolean isEmpty() {
            if (size == 0) {
                return true;
            } else return false;
        }
        int size() {
            return size;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Queue ll = new Queue();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        ll.display();
        System.out.println(ll.peek());
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.remove());
        ll.display();
    }
}
