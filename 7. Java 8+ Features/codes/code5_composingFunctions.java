import java.util.function.*;

public class code5_composingFunctions {
    public static void main(String[] args) {
        // for functions
        Function<Integer, Integer> plus3 = x -> x + 3;
        Function<Integer, Integer> into3 = x -> x * 3;
        Function<Integer, Integer> combine = plus3.andThen(into3);
        Function<Integer, Integer> compose = plus3.compose(into3);
        System.out.println(combine.apply(10));// first 10+3=13, then 13*3=39
        System.out.println(compose.apply(10)); // into3 then goes into plus 3, 10*3=30, 30+3=33

        // for predicates
        Predicate<String> pred1=s->s.equals("prateek");
        Predicate<String> pred2=String::isEmpty;
        Predicate<String> pred3=pred1.and(pred2).negate();
        System.out.println(pred3.test("prateek"));
    }
}
