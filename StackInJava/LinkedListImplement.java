package StackInJava;

public class LinkedListImplement {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Stack {
        private Node head = null;
        private int size = 0;
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        void displayrec(Node h) {
            if (h==null) {
                return;
            }
            displayrec(h.next);
            System.out.print(h.data+" ");
        }
        void display() {
            displayrec(head);
            System.out.println();
        }
        void displayReverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            return size;
        }
        boolean isEmpty() {
            if(size == 0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(9);
        st.display();
        // System.out.println(st.size());
        // System.out.println(st.pop());
        // System.out.println(st.peek());
        System.out.println(st.isEmpty());
        // st.display();
    }
}
