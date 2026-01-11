// Count words in a large file (CPU heavy)

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class code11_parallelStream {
    public static void main(String[] args) throws IOException {
        long word_count = Files.lines(Paths.get("text.txt")).parallel()
                .flatMap(line -> Arrays.stream(line.split("\\s+"))).filter(word -> !word.isEmpty()).count();

        System.out.println(word_count);

        // Files.lines() loads the file lazily (line by line).
        // .parallel() turns it into a parallel stream.
        // flatMap() splits each line into words.
        // count() returns the total word count.
    }
}
