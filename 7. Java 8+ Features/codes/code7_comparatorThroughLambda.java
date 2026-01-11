import java.util.Comparator;

public class code7_comparatorThroughLambda {
    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> Integer.compare(a.length(), b.length());

        System.out.println(comp.compare("heyyyyyyy", "prateek"));

    }
}
