package Assignment1;

public class PatternStar
{
    public static void main(String[] args)
    {
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int c=i; c<n; c++ ){
                System.out.print(" ");
            }
            for(int r =1;r<i*2;r++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int c=i;c<n;c++)
            {
                System.out.print(" ");
            }
            for (int r=1;r<i*2;r++)
            {
                System.out.print("*");
            }
            System.out.println();
        }










        
    }
}
