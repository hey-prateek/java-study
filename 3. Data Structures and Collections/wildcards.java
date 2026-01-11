import java.util.*;

public class wildcards {

    static void print(List<?> lst) {
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> lst1 = Arrays.asList("prateek", "tiwari", "ankit");
        List<Integer> lst2 = Arrays.asList(586, 562, 563);

        print(lst1);
        print(lst2);
    }
}
