package LinkedListInJava;

public class NthNodeFromEnd {

    static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int m =  size - n + 1;
        
        temp = head;
        for(int i = 1; i <= m -1; i++) {
            temp = temp.next;
        }

        return temp;
    }

    static Node ntNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    // Node head = null;
    // Node tail = null;
    
    static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static Node deleteNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for(int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    } 
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(77);
        Node d = new Node(22);
        Node e = new Node(99);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // 4 5 77 22 99
        // display(a);
        // Node q = nthNode(a, 3);
        // Node r = ntNode2(a, 3);
        // System.out.println(r.data);
        // display(a);

        deleteNthFromEnd(a, 2);
        display(a);
    }
}
