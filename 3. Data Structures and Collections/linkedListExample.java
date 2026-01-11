import java.util.LinkedList;
import java.util.Iterator;

public class linkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. add() - Add elements to end
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add(): " + list);

        // 2. addFirst() - Add element at beginning
        list.addFirst("Start");
        System.out.println("After addFirst(): " + list);

        // 3. addLast() - Add element at end
        list.addLast("End");
        System.out.println("After addLast(): " + list);

        // 4. get() - Access element by index
        System.out.println("Element at index 2: " + list.get(2));

        // 5. getFirst() & getLast()
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 6. set() - Update element
        list.set(2, "Updated");
        System.out.println("After set(2, Updated): " + list);

        // 7. remove() - Remove by value
        list.remove("B");
        System.out.println("After remove(B): " + list);

        // 8. removeFirst() & removeLast()
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst() & removeLast(): " + list);

        // 9. contains() - Check presence
        System.out.println("Contains 'Updated'? " + list.contains("Updated"));

        // 10. size() - Get total elements
        System.out.println("Size: " + list.size());

        // 11. clear() - Remove all
        list.clear();
        System.out.println("After clear(): " + list);

        // 12. isEmpty() - Check if empty
        System.out.println("Is empty? " + list.isEmpty());

        // 13. Refill and iterate
        list.add("X");
        list.add("Y");
        list.add("Z");
        System.out.println("List for iteration: " + list);

        // Using Iterator
        Iterator<String> it = list.iterator();
        System.out.print("Iterating: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
