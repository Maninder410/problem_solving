import java.util.*;
public class queueandlinkedlist {
    public static void main(String[] args) {
       // System.out.println("hello");
    Queue<Integer> q = new LinkedList<>();
    //queue is implemented using linked list in java
        q.offer(12);
        q.offer(32);
        q.offer(82);
        q.offer(32);
        System.out.println(q);
        System.out.println(q.poll());//pops and returns the front element
        System.out.println(q);
        System.out.println(q.peek());//this will not pop but it will show the front element
        System.out.println(q);
        //linked list can also be implemented as arraylist
        //just write List<Integer> list = new Linkedlist<>();
        //all the operations will be same
    }

}
