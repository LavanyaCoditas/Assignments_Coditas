package Assignment1;

import java.util.Scanner;

public class NumPattern
{
    public static void main(String[] args) {
        System.out.println("enter the value of n:");
        Scanner s = new Scanner(System.in);
        byte n=s.nextByte();
        for (int i = 5 ; i>0 ; i--)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
    }
}
