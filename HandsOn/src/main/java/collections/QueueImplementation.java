package collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by makeshk.kathirvel on 4/18/2017.
 */
public class QueueImplementation {
    public static void main(String args[]){
        Queue<String> queue = new ArrayBlockingQueue<String>(2);
        queue.add("makesh");
        queue.add("Ramesh");
        queue.offer("Guru");
        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue.peek());
    }
}
