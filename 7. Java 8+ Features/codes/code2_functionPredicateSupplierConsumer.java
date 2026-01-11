import java.util.function.*;

public class code2_functionPredicateSupplierConsumer {
    public static void main(String[] args) {
        Function<String, Integer> len = s -> s.length();
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Consumer<String> printer = s -> System.out.println(s);
        Supplier<Long> now = () -> System.currentTimeMillis();

        System.out.println(len.apply("prateek"));
        System.out.println(isEven.test(586));
        printer.accept("hey prateek...");
        System.out.println(now.get());
    }
}
