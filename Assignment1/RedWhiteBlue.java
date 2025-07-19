package Assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class RedWhiteBlue
{
    public static void main(String[] args)
    {
      int bag[]={1,2,0,2,1,1,0,0,0};
        System.out.println(Arrays.toString(SortBag(bag)));
    }
    public static int[] SortBag(int bag[])
    {  int []freq=new int[3];
        int zeroes=0, ones=0, twos=0;
        for(int i=0;i<bag.length;i++)
        {
         if( bag[i]==0)
         {
             zeroes++;
         } else if (bag[i]==1)
         {
             ones++;
         }
         else
         {
             twos++;
         }

        }
        int index=0;
        while(zeroes>0)
        {
            bag[index]=0;
            zeroes--;
            index++;
        }
        while(ones>0)
        {
            bag[index]=1;
            ones--;
            index++;
        }
        while(twos>0)
        {
            bag[index]=2;
            twos--;
            index++;
        }
      return bag;
    }
}
