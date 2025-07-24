package Assignment2;

public class BankDriver
{
    public static void main(String[] args)
    {
        BankAccountCustomException bank = new BankAccountCustomException(100);
        try
        {
            bank.withDraw(200);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println(e);
        }
    }
}
