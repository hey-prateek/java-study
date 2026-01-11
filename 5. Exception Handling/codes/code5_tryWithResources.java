import java.io.FileReader;
import java.io.IOException;

public class code5_tryWithResources {
    public static void main(String[] args)
    {
        try(FileReader fr=new FileReader("temp.txt"))
        {
            System.out.println((char)fr.read());
        }
        catch(IOException e)
        {
            System.out.println("error reading file...");
        }
    }
}
