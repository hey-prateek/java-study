import java.util.*;

public class code14_treeSet {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        // Insert
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(70);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(60);
        treeSet.add(80);

        // Inorder traversal (sorted order)
        System.out.println(treeSet);
        // [20, 30, 40, 50, 60, 70, 80]

        // Search
        System.out.println(treeSet.contains(40)); // true
        System.out.println(treeSet.contains(90)); // false

        // Remove
        treeSet.remove(30);
        System.out.println(treeSet);
        // [20, 40, 50, 60, 70, 80]
    }
}
