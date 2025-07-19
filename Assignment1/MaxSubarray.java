package Assignment1;

public class MaxSubarray
{
    public static void main(String[] args) {
        int nums[]={1,1001,23,-44,55,3,1};
        MaxArray(nums);
    }
    public static void MaxArray(int nums[])
    {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int currSum=0;
            for(int j=i;j< nums.length;j++)
            {
                currSum+=nums[j];

            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
}
