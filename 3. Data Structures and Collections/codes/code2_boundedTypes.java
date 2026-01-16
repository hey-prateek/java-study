import java.util.*;

//this data structure can only accept data of integer or of its subclassed like double, long,... so its bounded
class number_stack<T extends Integer> {
    List<T> lst;

    //instantiating list
    number_stack() {
        lst = new ArrayList<>();
    }

    //adding elements
    void push(T t) {
        this.lst.add(t);
    }

    //returning last element
    T pop() {
        return lst.get(lst.size() - 1);
    }
}

public class code2_boundedTypes {
    public static void main(String[] args) {
        
        // calling it for integer type
        number_stack<Integer> ns = new number_stack();
        ns.push(10);
        ns.push(20);
        ns.push(30);
        System.out.println(ns.pop());
    }
}
