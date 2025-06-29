import java.util.LinkedList;
import java.util.Queue;

class TreeRaghav {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int Size(Node root) {
        if (root == null)
            return 0;
        return 1 + Size(root.left) + Size(root.right);
    }

    public static int Sum(Node root) {
        if (root == null)
            return 0;
        return root.val + Sum(root.left) + Sum(root.right);
    }

    // 3 number ka maximum a,b,c : max(a, max(b,c))
    public static int maxValue(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int a = root.val;
        int b = maxValue(root.left);
        int c = maxValue(root.right);

        return Math.max(a, Math.max(b, c));
    }

   

    public static int minValue(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minValue(root.left), minValue(root.right)));
    }

    public static void preOrder(Node root) {
        // Pre-order traversal: root -> left -> right
        if (root == null)
            return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(Node root) {
        // In-order traversal: left -> root -> right
        if (root == null)
            return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);

    }

    public static void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
       if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left != null){
                q.add(temp.left);

            }
             if(temp.right != null){
                q.add(temp.right);
                
            }
            System.out.print(temp.val + " ");
            q.remove();
        }

    }

    public static int height(Node root){
        if(root== null || (root.left==null && root.right ==null)) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
    }

     
    public static void nthLevel(Node root, int n) { //left to right
        if (root == null)
            return;
        if (n == 1)
            System.out.print(root.val + " ");
            
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

      public static void nthLevel2(Node root, int n) { //right to left
        if (root == null)
            return;
        if (n == 1)
            System.out.print(root.val + " ");

        nthLevel2(root.right, n - 1);
        nthLevel2(root.left, n - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;

        // System.out.println(Size(root));
        // System.out.println(Sum(root));
        // System.out.println(maxValue(root));
        // System.out.println(height(root));
        // System.out.println(minValue(root));
        // preOrder(root);
        // inOrder(root);
        // BFS(root);

        int level = height(root) +1;
        for(int i=1;i<=level;i++){
            if(i%2 !=0) nthLevel(root, i);
         else nthLevel2(root, i);
      System.out.println();
        }
     
    }
}
