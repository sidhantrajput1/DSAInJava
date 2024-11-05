package DoublyLinkedList;

public class basic {
    public static class Node {
        int data;
        Node next;
        Node prev;
    
        // Constructor
        public Node(int data) {
            this.data = data;
        }
    }

    static void dispaly(Node head){
        Node temp = head;
        while(temp != null) {
            System.err.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // display reverse
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(66);
        Node e = new Node(96);


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
    }
}
