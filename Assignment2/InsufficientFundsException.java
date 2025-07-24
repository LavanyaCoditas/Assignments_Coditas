package Assignment2;

public class InsufficientFundsException extends  Exception{
   private double amount;
    public InsufficientFundsException(double amount)
    {
        super("what do you want ? you have less money than need");
        this.amount=amount;

    }
    public double getAmount()
    {
        return amount;
    }
}
