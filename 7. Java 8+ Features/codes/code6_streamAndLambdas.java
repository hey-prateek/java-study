import java.util.*;
import java.util.stream.Collectors;

public class code6_streamAndLambdas {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("alice", "bob", "sam", "david");

        List<String> newlst = lst.stream().filter(s -> s.length() > 3).map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        newlst.forEach(System.out::println);

        // group by
        Map<Integer, List<String>> map = lst.stream().collect(Collectors.groupingBy(String::length));

        map.forEach((k, v) -> {
            System.out.println(k + "-" + v);
        });
    }
}
