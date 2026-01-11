import java.util.Arrays;
import java.util.List;

public class code10_flatmap {
    public static void main(String[] args) {
        List<List<String>> lsts = Arrays.asList(Arrays.asList("hey", "prateek"), Arrays.asList("ankit", "kumar"));

        lsts.stream().flatMap(list -> list.stream()).forEach(System.out::println);
    }
}
