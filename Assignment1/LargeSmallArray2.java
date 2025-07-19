package Assignment1;

import java.util.Scanner;

public class LargeSmallArray2
{
    LargeSmallArray2()
    {
        //default constructor
    }
    static void calc(int arr[])
    {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > maxi)
            {
                maxi = arr[i];
            }
            if(arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("Largest : " + maxi);
        System.out.println("Smallest : " + mini);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements you want");
        int n= sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        calc(arr);
    }
}




