package LinkedListInJava;



public class Test {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
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

    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }   
        
    }

    static Node middleEle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Leetcode 141
    static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        if(head == null || head.next == null) return false;

        while (fast != null) {
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast  = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        // Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        // d.next = e;

        // LinkedList ll = new LinkedList();
        // ll.insertAtEnd(1);
        // ll.insertAtEnd(2);
        // ll.insertAtEnd(3);
        // ll.insertAtEnd(4);
        // ll.insertAtEnd(5);

        display(a);
        // Node rev =  reverse(a);
        // display(rev);
        // Node mid =  middleEle(a);
        // System.out.println(mid.data);
        boolean has = hasCycle(a);
        System.out.println(has);
    }
}
