package LinkedListInJava;

public class ReverseList {

    // Node head = null;
    // Node tail = null;

    public static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
        }
    }

    static void displayList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.err.println(temp.next+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        displayList(a);
    }
}