package StackInJava;

public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Stack {
        int size = 0;
        Node head = null;
        void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        int peek() {
            if(head == null) {
                System.out.println("Stack is Empty");
                return -1 ;
            }
            return head.data;
        }

        boolean isEmpty() {
            if (size == 0) {
                return  true;
            } else return false;
        }

        int size() {
            return size;
        }
        
        void displayr() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
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

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.displayr();
    }
}
