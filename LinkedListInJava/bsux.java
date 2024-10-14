package LinkedListInJava;

public class bsux {
    
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static int length(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    static void print1(Node head) {
        if(head == null ){
            return;
        }
        print1(head.next);
        System.out.print(head.data+" ");
    }

    public static void main(String[] args) {
        // Node a = new Node(1);
        // Node b = new Node(2);
        // Node c = new Node(3);
        // Node d = new Node(4);
        // Node e = new Node(5);
        bsux ll = new bsux();

        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(5);
        
        ll.print();
        

        // System.out.println(e.data);
        // print1(a);
        System.out.println();
        // System.out.println("List of length is : "+length(a));
    }
}
