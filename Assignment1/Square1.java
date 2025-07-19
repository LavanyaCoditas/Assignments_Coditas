package Assignment1;
import java.util.Scanner;

public class Square1 {
    public Square1()
    {
        //default constructor
    }

    // method that takes the input of the side of square dynamically
    public static  double InputSide( Scanner s)
    {
         System.out.println("Enter the side of square: ");
         double side = s.nextDouble();
       return side;
    }

    //method that calculates the area
    public static double Area(double side)
    {
         int raise =2;
        double area = power(side,raise );//base,raise
        return area;
    }

    //method that return the square of side
    public static double power(double side , int raise)
    {
        double power=1;
        for(int i =1;i<=2; i++)
        {
            power*=side;
        }
        return power;
    }

    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("the area of the square is:"+Area( InputSide(s)));

    }
}
