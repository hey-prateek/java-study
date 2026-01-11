// Write a function that returns a predicate checking if a string contains any of the given keywords.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class code8_practice1 {
    public static void main(String[] args) {
        // Predicate<String> pred=s -> s.contains("hey")||s.contains("prateek");
        List<String> lstToMatch = Arrays.asList("hey", "prateek");
        Predicate<String> pred = s -> lstToMatch.stream().anyMatch(k -> s.contains(k));
        System.out.println(pred.test("hepratek")); // false
        System.out.println(pred.test("prateek")); // true
    }
}
