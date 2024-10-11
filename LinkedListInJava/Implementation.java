package LinkedListInJava;

public class Implementation {

    public class Node {
        int data; 
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public  class LinkedList {
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                // tail = temp;
            } else {
                tail.next = temp;
                // tail = temp;
            }
            tail = temp;
        }
        void display() {
            Node temp = head;
            while(temp != null) {
                System.err.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    

    public static void main(String[] args) {
        Implementation imple = new Implementation();
        LinkedList ll = imple.new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(77);

        ll.display();
    }
}
