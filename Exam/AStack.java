public class AStack {
    public static class Stack {
        int[] arr = new int[50];
        int idx = 0;
        
        void push(int x) {
            if (idx == arr.length) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if(idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if(idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for(int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isFull() {
            if(arr.length == idx) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(7);
        st.display();
    }
}
