package DoublyLinkedList;

public class InsertAtAnyIdx {
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

    // insert At tail
    static Node insertAttail(Node head ,int x) {
        Node temp = head;
        // temp ko tail tak leke jate hai
        while(temp.next != null) {
            temp = temp.next;
        }

        Node t =  new Node(x);
        temp.next = t;
        t.prev = temp;
        temp = t;

        return temp;
    }

    static void InsertAtAnyidx(Node head, int idx, int x) {
        Node s = head;
        for(int i = 1; i <= idx-1; i++) {
            s = s.next;
        }
        // s is at idx-1 postion
        Node r = s.next; // idx
        Node t = new Node(x);
        // s t r
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
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

        // dispaly(a);
        // System.out.println();
        // Node newNode = InsertAthead(a, 30);
        // dispaly(newNode);

        // insertAttail(a, 6);
        InsertAtAnyidx(a, 3, 077);
        dispaly(a);
    }   
}
