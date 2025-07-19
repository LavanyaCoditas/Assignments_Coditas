package Assignment1;

import java.util.Scanner;

public class Average1 {
    Average1()
    {
        //default constructor
    }
    public  static float Average(float num1, float num2, float num3,int count)
    {
        float sum = num1+ num2 + num3;
        float avg = sum / count;
        return avg;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to calculate average for:");

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println("Enter count of the numbers entered: ");
        int count = sc.nextInt();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Calculated average :"+ Average(num1,num2,num3,count));


    }
}
