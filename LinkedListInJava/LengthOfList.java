package LinkedListInJava;

public class LengthOfList {

    static void display(Node head) {
        Node temp =  head;
        while (temp != null) {
            System.err.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static int sizeOfList(Node a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }

    public static class Node {
        int data;
        Node next;
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
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        System.err.println();
        int res = sizeOfList(a);
        System.err.println("Size of list is : "+res);
    }
}
