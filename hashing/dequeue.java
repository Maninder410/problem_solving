import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(54);
        adq.offerLast(83);
        adq.offerLast(82);
        adq.offerLast(28);
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        adq.pollLast();
        adq.pollFirst();
        //poll will remove the element peek will not
        System.out.println(adq);

    }
}
