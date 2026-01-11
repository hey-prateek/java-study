@FunctionalInterface
interface funcint<T, R> {
    R prints(T t) throws Exception;
}

public class code3_customFunctionalInterfaceWithGenerics {
    public static void main(String[] args) {
        funcint<String, Integer> f = (s) -> s.length();
        try {
            System.out.println(f.prints("prateek"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
