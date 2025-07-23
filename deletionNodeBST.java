import java.util.*;

public class deletionNodeBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        String[] arr = { "50", "20", "60", "17", "34", "55", "89", "10", "", "28", "","","", "70", "", "", "14" };

        // Create a simple tree manually from your array values
        Node root = new Node(50);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(17);
        root.left.right = new Node(34);
        root.right.left = new Node(55);
        root.right.right = new Node(89);
        root.left.left.left = new Node(10);
        root.left.right.right = new Node(28);
        root.right.right.left = new Node(70);
        root.left.left.right = new Node(14);


        preOrder(root); // Changed from preOrder(null)
        System.out.println();
        delete(root, 10); // Changed from delete(null, 34)
        preOrder(root); // Add this line t tree after deletion
    }

    private static void delete(Node root, int target) {
        if (root == null)
            return;

        if (root.val > target) {
            if (root.left == null)
                return;
            if (root.left.val == target) {
                Node l = root.left;
                if (l.left == null && l.right == null)
                    root.left = null;
                else if (l.left == null || l.right == null) {
                    if (l.left != null)
                        root.left = l.left;
                    else
                        root.left = l.right;
                }
            } else
                delete(root.left, target);
        } else if (root.val < target) { // Add this condition
            if (root.right == null)
                return;
            if (root.right.val == target) {
                Node r = root.right;

                if (r.left == null && r.right == null)
                    root.right = null;
                else if (r.left == null || r.right == null) {
                    if (r.left != null)
                        root.right = r.left;
                    else
                        root.right = r.right;
                }
            } else
                delete(root.right, target);
        }
        // Handle case when root.val == target (currently just returns)
    }

    public static void preOrder(Node root) {
        // Pre-order traversal: root -> left -> right
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
}
