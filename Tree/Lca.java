package Tree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Lca {
    public Node lca(Node root, int p, int q) {

        if (root == null)
            return null;
        if (root.val == p || root.val == q)
            return root;

        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);

        if (left == null)
            return right;
        if (right == null)
            return left;

        return root;
    }

    public static void main(String[] args) {
        System.out.println("Hallo Dev");
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);
        
        
        Lca main = new Lca();

        Node lcaNode = main.lca(root, 2, 8);
        if (lcaNode != null) {
            System.out.println("LCA of 2 and 8: " + lcaNode.val);
        }
    }
}
