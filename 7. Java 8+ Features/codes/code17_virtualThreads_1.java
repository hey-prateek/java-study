import java.util.*;

public class code17_virtualThreads_1 {
    public static void main(String[] args) {
        List<Thread> lst = new ArrayList<>();

        Runnable r = () -> {
            System.out.println("running thread: " + Thread.currentThread().getName());
        };

        Thread t = null;
        for (int i = 1; i <= 1000000; i++) {
            t = new Thread(r); // normak thread way
            t = Thread.ofVirtual().unstarted(r); // virtual thread way
            t.setName(String.valueOf(i));
            lst.add(t);
        }
        System.out.println(lst.size());
        for (Thread thread : lst) {
            thread.start();
        }
    }
}
