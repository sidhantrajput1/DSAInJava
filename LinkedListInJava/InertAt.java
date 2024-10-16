package LinkedListInJava;

public class InertAt {
    
    public class Node{
        int data ;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;
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

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    int size() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void InsertAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void deleteAt(int idx) {
        Node temp = head;
        for(int i = 1; i <= idx -1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    void insertAt(int idx, int val) {
        Node t = new Node(val);
        Node temp = head;

        if (idx == size()) {
            insertAtEnd(val);
            return;
        } else if (idx == 0) {
            InsertAtHead(val);
            return;
        } else if(idx<0 || idx > size()) {
            System.err.println("Wrong answer");
            return;
        } 

        for(int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    int getAt(int idx) {
        Node temp = head;
        for(int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        InertAt ll = new InertAt();
        ll.insertAtEnd(1);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);

        // ll.insertAt(0, 6);
        ll.display();
        System.out.println();
        ll.deleteAt(4);
        ll.display();
        // ll.getAt(3);
        System.out.println();
        System.err.println(ll.getAt(2));
    }
}
