import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class code19_virtualThreads_3 {
    public static void main(String[] args)
    {
        try(ExecutorService ex=Executors.newVirtualThreadPerTaskExecutor())
        {
            //"newVirtualThreadPerTaskExecutor" creates a new virtual thread for each task
            ex.submit(() -> System.out.println("virtual thread running..."));
        }
    }
}
