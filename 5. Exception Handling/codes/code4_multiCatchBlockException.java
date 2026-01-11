public class code4_multiCatchBlockException {
    public static void main(String[] args)
    {
        try
        {
            int[] arr=new int[2];
            arr[5]=100;
        }
        catch(ArrayIndexOutOfBoundsException | NullPointerException e)
        {
            System.out.println("exception caught...");
        }
    }
}
