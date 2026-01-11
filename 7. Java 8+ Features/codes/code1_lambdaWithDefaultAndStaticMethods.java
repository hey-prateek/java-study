@FunctionalInterface
interface myint {
    // default method -> use default keyword
    default void prints_default() {
        System.out.println("default method...");
    }

    // static method
    static void prints_static() {
        System.out.println("static method...");
    }

    // abstract method
    void prints_abstract();
}

public class code1_lambdaWithDefaultAndStaticMethods {
    public static void main(String[] args) {
        myint obj = () -> System.out.println("inside abstract method...");

        obj.prints_abstract();

    }
}