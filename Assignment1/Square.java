package Assignment1;
import java.util.Scanner;
public class Square
{
     Square()
     {
         // no - argument constructor
     }
    public static double Area(double side)
    {
        double area;
        area = side*side;
        return area;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System. in);
        Square sq = new Square();
        System.out.println("Enter side of square in cm: ");
        double side = sc.nextDouble();
        System.out.println(" Area of Square : "+sq.Area(side)+" cm2");

    }

}
