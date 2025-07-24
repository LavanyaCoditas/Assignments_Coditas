package Assignment2;

public class BankAccountCustomException
{
    private double balance;
    public BankAccountCustomException( double amount)
    {
        this.balance=amount;
    }
    public void withDraw(double amount) throws InsufficientFundsException
    {
        if(amount>balance)
        {
            //here rather than throwing the inbuilt exception throw the class you have created that inherits the Exception class
            throw new InsufficientFundsException(amount);
        }
        balance-=amount;
    }
}
