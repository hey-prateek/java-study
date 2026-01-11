import java.util.*;

class printElements<T> {
    void printElements(List<T> lst) {
        for (T item : lst) {
            System.out.println(item);
        }
    }
}

public class generics {
    public static void main(String[] args) {
        List<String> strLst = Arrays.asList("prateek", "tiwari", "ankit");
        printElements<String> obj1 = new printElements();
        obj1.printElements(strLst);

        List<Integer> intLst = Arrays.asList(586, 562, 564, 565);
        printElements<Integer> obj2 = new printElements();
        obj2.printElements(intLst);
    }
}