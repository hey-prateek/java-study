import java.util.*;

//T means "type parameter" can take any type
class printElements<T> {
    void printElements(List<T> lst) {
        for (T item : lst) {
            System.out.println(item);
        }
    }
}

public class code1_generics {
    public static void main(String[] args) {

        // here writing string is a generic
        List<String> strLst = Arrays.asList("prateek", "tiwari", "ankit");
        printElements<String> obj1 = new printElements();
        obj1.printElements(strLst);

        List<Integer> intLst = Arrays.asList(586, 562, 564, 565);
        printElements<Integer> obj2 = new printElements();
        obj2.printElements(intLst);
    }
}