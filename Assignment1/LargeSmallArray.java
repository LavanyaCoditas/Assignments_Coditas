package Assignment1;

import java.util.Scanner;
import java.util.Scanner;

public class LargeSmallArray
{
     public static int Small(int arr[],int size)
     {
         int small=arr[0];
         for(int i =1 ; i<size ; i++)
         {
             if(arr[i]<small)
             {
                 small=arr[i];
             }
         }
          return small;
     }
     public static int Large(int arr[], int size)
     {
          int large=arr[0];
         for(int i=1;i<size; i++)
         {
             if(large<arr[i])
             {
               large=arr[i];
             }
         }
         return large;
     }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();

        int arr [] = new int[size];
        System.out.println("Enter elements of array:");

        for(int i= 0 ;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.println("Smallest number is:"+Small(arr,size));
        System.out.println("Largest number is :"+Large(arr,size));




    }
}
