import java.util.function.*;

class MyClass {
    MyClass(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
}

public class code4_methodAndConstructorReferences {
    public static void main(String[] args) {
        Function<String, String> createString = String::new; // method reference, new method in string class
        String s1 = createString.apply("hey");
        String s2 = createString.apply("hey");
        String s3 = "hey";
        String s4 = "hey";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // pointing to new references, as created using new
        System.out.println(s3 == s4); // pointing to same reference, so objects are same

        BiPredicate<String, String> equalString = String::equals; // (a, b) -> a.equals(b)
        System.out.println(equalString.test("hey...", "prateek"));

        // Constructor reference with arguments
        BiFunction<String, String, MyClass> c = MyClass::new; // if MyClass has (String, Integer)
        c.apply("hey", "prateek");

    }
}
