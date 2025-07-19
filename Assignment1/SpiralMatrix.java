package Assignment1;

public class SpiralMatrix
{
    public static void main(String[] args)
    {
         int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
         int rows= arr.length;
         int col=arr[0].length;
          int top=0, left=0, down =rows-1, right=col-1;
          int direction =0;

        while(top<down && left<right)
        {
            if(direction==0)
            {
                for(int i = left; i<=right;i++)
                {
                    System.out.print(" "+arr[top][i]);

                }
                top++;
            } else if (direction==1)
            {
                for(int i= top;i<=down;i++)
                {
                    System.out.print(" "+arr[i][right]);

                }
                right --;
            }
            else if(direction==2)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(" "+arr[down][i]);

                }
                down --;
            }
            else
            {
                for(int i= down; i>=down;i--)
                {
                    System.out.print(arr[i][left]);


                }
                left++;
            }
            direction=direction+1%4;
        }

    }
}
