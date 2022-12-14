import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.PriorityQueue;
public class priorityqueue {
    public static void main(String[] args) {
       // Queue<Integer> pq= new PriorityQueue<>();
       //elements are inserted according to min heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //max-heap;
        pq.offer(12);
        pq.offer(32);
        pq.offer(82);
        pq.offer(32);
        System.out.println(pq);
//        System.out.println(q.poll());//pops and returns the front element
//        System.out.println(q);
//        System.out.println(q.peek());//this will not pop but it will show the front element
//        System.out.println(q);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
