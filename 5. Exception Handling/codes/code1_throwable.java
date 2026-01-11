public class code1_throwable
{
    public static void main(String[] args)
    {
        try
        {
            int x=10/0;
        }
        catch(Throwable t) //throwable class is the main class
        {
            System.out.println("caught..."+t.getMessage());
        }
    }
}