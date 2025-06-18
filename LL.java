

public class LL{


    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size =0;
    }
  

    public void insertFirst( int val){
        Node node = new Node(val);
        node.next= head;
        head= node;

        if(tail == null){
            tail = head;
        }
        size +=1;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
        }else{
            tail.next = node;
            tail = node;
        }
        size +=1;
    }



    public int deleteFirst(){
        int val = head.value;
        head= head.next;

        if(head==null){
            tail= null;
        }
        size--;
        return val;
    }


    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    //insert using recursion
    public void insertRec(int val, int index){
         head = insertRec(val, index, head);


    }
    private Node insertRec(int val, int index, Node node){
        if(index ==0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

       node.next =  insertRec(val, index--, node.next);
       return node;
    }




    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }





    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        } 
     if(index==size){
        insertLast(val);
        return;
     }
     Node temp = head;
     for(int i=1; i<index; i++){
         temp = temp.next;
     }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

 

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    

    //questions

    //q.83
    public void duplicate(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next= node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //merge q-21
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        
        LL  ans = new LL();

        while(f !=null && s!=null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f=f.next;
            } else{
                ans.insertLast(s.value);
                s= s.next;
            }
        }

        while(f!=null) {
          ans.insertLast(f.value);
          f=f.next;

        }

        while(s !=null){
          ans.insertLast(s.value);
          s=s.next;
        }
        return ans;
    }

    //q-141
    // public boolean hasCycle(ListNode head) {
    //     ListNode fast = head;
    //     ListNode slow = head;

    //     while(fast !=null && fast.next !=null){
    //         fast= fast.next.next;
    //         slow = slow.next;

    //         if(fast==slow){
    //             return true;
    //         }
    //     }

    //     return false;
    // }



    //find length of the cycle
    // public int lengthCycle(ListNode head) {
    //     ListNode fast = head;
    //     ListNode slow = head;

    //     while(fast !=null && fast.next !=null){
    //         fast= fast.next.next;
    //         slow = slow.next;

    //         if(fast==slow){
    //           //calculate the length
    //           ListNode temp= slow;
    //           int length =0;

    //           do{
    //             temp = temp.next;
    //             length++;
    //             } while(temp != slow);
    //           return length;
    //         }
    //     }

    //     return 0;
    // }


//q-202
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
 
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        if(slow ==1){
            return true;
        } else{
            return false;
        }
      

    }

    private int findSquare(int number){
        int ans =0;
        while(number >0){
            int remo = number %10;
            ans += remo * remo;
            number /=10;
        }
        return ans;
    }


    //q. 876
    // public ListNode middleNode(ListNode head) {
    //     ListNode f = head;
    //     ListNode s = head;

    //     while(f !=null && f.next !=null){
    //         f = f.next.next;
    //         s = s.next;
    //     }
    //     return s;
    // }


    //recursive reversal of LL
    private void reverse(Node node){
        if(node ==tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;  
    }


    //in place reversal of LL 
    public void reverse(){
        if(size <2){
            return;

        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present !=null){
            present.next = prev;
            prev = next;
            present = next;
            if(next !=null){
                next = next.next;
            }
        }
        head = prev;
    }
 


    public static void main(String[] args) {
        LL first =  new LL();
        LL second = new LL();


        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();
    }
}
    // public static void main(String[] args) {
    //     LL list = new LL();
    //     list.insertFirst(3);
    //     list.insertFirst(2);
    //     list.insertFirst(8);
    //     list.insertFirst(17);
    //     list.insertFirst(99);
    //     list.insert(100, 3);
    //     list.display();
    //     // list.display(); // 17 -> 8 -> 9 -> 5 -> 3 -> END 
    //     System.out.println(list.deleteFirst()); // 17
    //     list.display();
        
    //     System.out.println(list.deleteLast()); // 3
    //     list.display();

    //     list.insertRec(88, 2);
    //     list.display();
       
    

