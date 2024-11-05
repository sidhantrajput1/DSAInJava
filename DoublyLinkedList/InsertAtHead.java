package DoublyLinkedList;

public class InsertAtHead {
    public static class Node {
        int data ;
        Node next;
        Node prev;
        // constructor
        Node(int data) {
            this.data = data;
        }
    }

    static void dispaly(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static Node InsertAthead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t; 

        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        dispaly(a);
        System.out.println();
        Node newNode = InsertAthead(a, 30);
        dispaly(newNode);
    }
}
