public class DList {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int val) {
            this.data = val;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // insert At head;
    static Node InsertAthead(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    // insert at end
    static Node insertAtEnd(Node head, int k) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        };

        Node newNode = new Node(k);
        temp.next = newNode;
        temp.prev = temp;
        head = temp;
        return temp;
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

        Node aa = InsertAthead(a, 30);
        display(aa);
        insertAtEnd(a, 6);
        display(a);
    }
}
