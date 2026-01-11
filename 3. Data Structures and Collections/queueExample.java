import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class queueExample {
    public static void main(String[] args) {
        // 1. Unbounded Queue (LinkedList)
        Queue<String> unboundedQueue = new LinkedList<>();

        System.out.println("=== Unbounded Queue (LinkedList) ===");
        System.out.println("Initially empty? " + unboundedQueue.isEmpty()); // true

        unboundedQueue.add("A");
        unboundedQueue.add("B");
        System.out.println("After adding elements: " + unboundedQueue);

        unboundedQueue.poll(); // removes "A"
        unboundedQueue.poll(); // removes "B"
        System.out.println("After removing all: " + unboundedQueue); // []
        System.out.println("Is empty now? " + unboundedQueue.isEmpty()); // true
        System.out.println("poll() on empty: " + unboundedQueue.poll()); // null
        // unboundedQueue.remove(); // throws NoSuchElementException

        System.out.println();

        // 2. Bounded Queue (ArrayBlockingQueue)
        Queue<String> boundedQueue = new ArrayBlockingQueue<>(3);
        System.out.println("=== Bounded Queue (ArrayBlockingQueue, capacity 3) ===");

        boundedQueue.add("X");
        boundedQueue.add("Y");
        boundedQueue.add("Z");
        System.out.println("After filling queue: " + boundedQueue);

        System.out.println("Is full? " + (boundedQueue.size() == 3)); // true

        // add() throws exception when full
        try {
            boundedQueue.add("W");
        } catch (Exception e) {
            System.out.println("add() failed: " + e);
        }

        // offer() returns false when full
        System.out.println("offer() result: " + boundedQueue.offer("W"));

        // Remove elements to make space
        boundedQueue.poll(); // removes X
        System.out.println("After one removal: " + boundedQueue);

        // Now adding works again
        boundedQueue.offer("W");
        System.out.println("After adding again: " + boundedQueue);
    }
}
