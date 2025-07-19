package Assignment1;

public class ButterflyPattern
{
    public static void main(String[] args)
    {
        int n=6;
        for(int r=1; r<=n; r++)
        {
            for(int str=1;str<=r;str++)
            {
                System.out.print("*");
            }
            for(int  sp =(n*2)-r; sp>r;sp--)
            {
                System.out.print(" ");
            }
            for(int str=1;str<=r;str++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int str=n;str>=i;str--)
            {
                System.out.print("*");
            }
            for(int sp=0; sp<i*2-2;sp++)
            {
                System.out.print(" " );
            }
            for(int str=n;str>=i;str--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

