import java.util.Optional;

public class code12_optional {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("hey");

        String name = null;
        Optional<String> op2 = Optional.ofNullable(name);

        System.out.println(op1 + " " + op2);

        String s1 = op1.get();
        String s2 = op2.orElse("default");
        String s3 = op2.orElseGet(() -> "or else default"); // supplier method is inside this orelseget

        System.out.println(s1 + "\n" + s2 + "\n" + s3);

        String s4 = op2.orElseThrow(() -> new RuntimeException("empty value..."));

    }
}
