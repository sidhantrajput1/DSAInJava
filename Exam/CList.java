public class CList {
    public static class Node {
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertAtEnd(int val){
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }


    public void InsertAthead(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }


    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }


    public static void main(String[] args) {
        CList ll = new CList();
        ll.insertAtEnd(1);   
        ll.insertAtEnd(2);   
        ll.insertAtEnd(3);   
        ll.insertAtEnd(4);   
        ll.insertAtEnd(5);

        ll.InsertAthead(12);
        ll.InsertAthead(18);
        ll.InsertAthead(14);
        
        ll.display();
    }
}
