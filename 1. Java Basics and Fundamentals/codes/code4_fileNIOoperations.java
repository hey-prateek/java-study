import java.io.IOException; // Handles input/output related checked exceptions
import java.nio.file.Files; // Provides utility methods for file operations
import java.nio.file.Paths; // Used to create Path objects from file paths

public class code4_fileNIOoperations {

    public static void main(String[] args) throws IOException {
        // Reads the entire content of input.txt as a String using NIO
        String text = Files.readString(Paths.get("input.txt"));

        // Prints the file content to the console
        System.out.println(text);

        // Writes the same content into output.txt (creates file if not exists,
        // overwrites if exists)
        Files.writeString(Paths.get("output.txt"), text);
    }
}
