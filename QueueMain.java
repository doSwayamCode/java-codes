import java.util.Queue;
public class QueueMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50); 
        queue.insert(60);

        queue.display();

        //  System.out.println(queue.remove());

         queue.insert(133);

         queue.display();
    }

}
