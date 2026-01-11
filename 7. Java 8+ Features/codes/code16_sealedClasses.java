sealed abstract class payment permits cash, card
{
    abstract public void payment();
}

final class cash extends payment
{
    public void payment()
    {
        System.out.println("paid via cash...");
    }
}

final class card extends payment
{
    public void payment()
    {
        System.out.println("paid via card...");
    }
}

public class code16_sealedClasses {
    public static void main(String[] args)
    {
        cash cs=new cash();
        cs.payment();

        card cr=new card();
        cr.payment();
    }
}
