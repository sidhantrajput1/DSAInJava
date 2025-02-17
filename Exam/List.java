public class List {
    public static class Node {
        int data;
        Node next;
        Node(int val) {
            this.data = val;
        }
    }

    static void insertAtNull(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next; 
        }
        t.next = temp;
    }

    // implement singly linked list

    Node head = null;
    Node tail = null;
    
    void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    // display Node
    static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int size(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static Node insertAtStart(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        return head;
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
        // insert at end
        insertAtNull(a, 8);
        insertAtNull(a, 10);
        display(a);
        Node aa = insertAtStart(a, 11);
        display(aa);
        System.out.println("Size of List is : "+size(a));
    }
}
