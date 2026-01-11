public class code18_virtualThreads_2 {
    public static void main(String[] args) throws Exception
    {
        //"startVirtualThread" creates a virtual thread
        Thread t=Thread.startVirtualThread(() -> {System.out.println("virtual thread running...");});
        t.join();
    }
}
