public class DLL {

   private Node head;

   public void insertFirst(int val){
      Node node = new Node(val);
      node.next= head;
      node.prev = null;

        if(head != null){
             head.prev = node;
        }
        head = node;
   }

   public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last= node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse :");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START ");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head== null){
            node.prev = null;
            head= node;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next= node;
        node.prev = last;
    }
 
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void insert(int after, int val){
        Node p = find(after);

        if(p ==null){
            System.out.println("Node not found");
            return;
        }

        Node node = new Node (val);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if(node.next != null){
            node.next.prev = node;
        }
    }

     



    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.insertLast(99);
        list.insert(8, 65);

        list.display();
    }
}


