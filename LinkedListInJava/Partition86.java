package LinkedListInJava;


public class Partition86 {
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val; 
        }
    }

    static Node partition(Node head, int x) {
            Node before = new Node(0);
            Node after = new Node(0);
            Node before_curr = before;
            Node after_curr = after;
    
            while (head != null) {
                if(head.val < x) {
                    before_curr.next = head;
                    before_curr = before_curr.next;
                } else {
                    after_curr.next = head;
                    after_curr = after_curr.next;
                }
                head = head.next;
            }
            after_curr.next = null;
            before_curr.next = after.next;
    
            return before.next;
        }
        
        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(4);
            Node c = new Node(3);
            Node d = new Node(2);
            Node e =  new Node(5);
            Node f = new Node(2);
    
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
    
            print(a);
            Node result = partition(a, 3);
            System.out.println();
            print(result);
    }
}
