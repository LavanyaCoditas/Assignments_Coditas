package Assignment1;

import java.util.Scanner;

public class MaxSubarray2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");

        int size=sc.nextInt();
        System.out.println("Enter the elements");

        int nums[]=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("the max sum of subarray is:"+Subarray(nums));
    }
    public static int Subarray(int nums[])
    {
        int maxSum=nums[0];
        int currSum=nums[0];
        for(int i=1;i< nums.length;i++)
        {
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
