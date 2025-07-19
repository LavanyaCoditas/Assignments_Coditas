package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter number of elements you want");
        int size = sc.nextInt();
        int nums[]= new int[size];
        System.out.println("Enter the array elements");
        for(int ipIndex=0; ipIndex<size;ipIndex++)
        {
            nums[ipIndex]=sc.nextInt();
        }
        int target=12;
QuadrupleSum(nums,target);
    }
    public static void QuadrupleSum(int nums[],int target)
    {
        Arrays.sort(nums);
        for(int i =0;i< nums.length;i++)
        {
            for( int j= i+1; j< nums.length;j++)
            {
                int left=j+1;
                int right= nums.length-1;
                while(left<right)
                {
                    int sum = nums[left]+nums[right]+nums[i]+nums[j];
                    if(sum==target)
                    {
                        ArrayList <Integer> mylist =new ArrayList<>();
                        mylist.add(nums[left]);
                        mylist.add(nums[right]);
                        mylist.add(nums[i]);
                        mylist.add(nums[j] );
                        System.out.println(mylist);
                        break;

                    }
                    else if(sum>target)
                    {
                       right--;
                    }
                    else {
                        left++;
                    }

                }



            }
        }

    }
}
