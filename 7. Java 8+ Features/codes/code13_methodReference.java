import java.util.function.Function;
import java.util.function.Supplier;

class employee {
    String name;

    employee(String name) {
        this.name = name;
    }

    employee() {
        this.name = "default";
    }
}

public class code13_methodReference {
    public static void main(String[] args) {
        // static method reference
        Function<String, Integer> func = Integer::parseInt;
        String s = "586";
        System.out.println(func.apply(s));

        // instance method reference
        StringBuilder sb = new StringBuilder("prateek");
        Supplier<Integer> func1 = sb::length;
        System.out.println(func1.get());

        // instance method reference of a predefined class like string
        Function<String, String> func2 = String::toUpperCase;
        System.out.println(func2.apply("prateek"));

        // constructor reference
        Function<String, String> func3 = String::new;
        String s1 = func3.apply("hey");
        String s2 = func3.apply("hey");
        System.out.println(s1 == s2); // false because both are made using new keyword

        // constructor reference with class example, first one with arg, second without
        // arg(use supplier)
        Function<String, employee> func4 = employee::new;
        Supplier<employee> func5 = employee::new;
        employee e1 = func5.get();
        employee e2 = func4.apply("prateek");
        System.out.println(e1.name + " - " + e2.name);

    }
}
