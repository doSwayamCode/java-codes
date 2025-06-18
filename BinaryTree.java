import java.util.Scanner;

class BinaryTree {

    public BinaryTree(){

    }


    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
           
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner scanner){
         System.out.println("enter the root Node: ");
         int value = scanner.nextInt();
            root = new Node(value);
            populate(scanner, root);

    }

    private void populate(Scanner scanner, Node node){
        System.out.println("do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }


        System.out.println("do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    public void display(){
        display(root, "");
    }

    private display(Node node, String indent){
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }





    public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }

//pre order traversal
    public void preOrder() {
    preOrder(root);    
    }
    
    private void preOrder(Node node) {
    if (node == null) {
        return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
    }

//in order traversal    
    public void inOrder() {
    inOrder(root);
    }
     private void inOrder(Node node) {
    if (node == null) {
        return;
    }

    preOrder(node.left);
    System.out.print(node.value + " ");
    preOrder(node.right);
    }

//post order traversal
     public void postOrder() {
    inOrder(root);
    }
     private void postOrder(Node node) {
    if (node == null) {
        return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
    System.out.println(node.value + " ");
    }
  }
}


