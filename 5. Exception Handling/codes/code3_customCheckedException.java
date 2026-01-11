class myCheckedException extends Exception
{
    myCheckedException(String str)
    {
        System.out.println(str);
    }
}

public class code3_customCheckedException {
    public static void main(String[] args) throws myCheckedException
    {
        throw new myCheckedException("caught checked exception...");
    }
}
