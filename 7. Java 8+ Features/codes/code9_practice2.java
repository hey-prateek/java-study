//Convert a List<Person> to Map<Id, Person> handling duplicate ids by keeping the first.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class person {
    int id;
    String name;

    person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return this.id;
    }
}

public class code9_practice2 {
    public static void main(String[] args) {
        List<person> lst = Arrays.asList(new person(1, "prateek"), new person(2, "ankit"), new person(1, "muskan"));

        // Map<Integer, List<person>> map = lst.stream().collect(Collectors.groupingBy(p
        // -> p.id));

        Map<Integer, person> map = lst.stream()
                .collect(Collectors.toMap(
                        person::getId, // how to get the key (id)
                        p -> p, // value is the Person object
                        (first, duplicate) -> first // keep the first one
                ));

        map.forEach((k, v) -> System.out.println(k + "-" + v.name));
    }
}
