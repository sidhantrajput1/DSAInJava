package LinkedListInJava;

public class basic {
    public static class Node {
        int data; // value
        Node next; // address of next node;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        // 1 -> 2 -> 3 -> 4
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // System.out.println(y.next); // LinkedListInJava.basic$Node@5ea434c8
        Node temp = a;
        for(int i = 1; i <= 5; i++) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
