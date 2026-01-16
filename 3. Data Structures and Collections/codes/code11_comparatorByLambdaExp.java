import java.util.*;

class student {
    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class code11_comparatorByLambdaExp {
    public static void main(String[] args) {
        List<student> lst = Arrays.asList(new student("kanye", 45), new student("drake", 36));

        // now using comparator we can sort this lst by age
        Comparator<student> comp = (s1, s2) -> Integer.compare(s1.age, s2.age);

        // list is sorted now
        Collections.sort(lst, comp);

        for (student s : lst) {
            System.out.println(s.age);
        }
    }
}
