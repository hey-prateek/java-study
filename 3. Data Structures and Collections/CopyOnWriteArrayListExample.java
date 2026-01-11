import java.util.*;
import java.util.concurrent.*;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<>(Arrays.asList("prateek", "tiwari", "nnrg"));
        Iterator<String> it = arr.iterator();
        String temp;
        while (it.hasNext()) {
            temp = it.next();
            System.out.println(temp);

            if (temp.equals("nnrg")) {
                arr.remove(temp);
            }
        }
        System.out.println("list now: " + arr);
    }
}
