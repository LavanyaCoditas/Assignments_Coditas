package Assignment1;

import java.util.Scanner;

public class TaxSlab {

    public TaxSlab()
    {
        //default constructor
    }
    public static void NewTax(double salary)
    {
        double tax;
        if(salary>0 && salary<=250000)
        {
            System.out.println("no tax");

        }

        else if (salary>250000 && salary<=500000)
        {
            System.out.println("tax cut by 5%");
           tax = (salary *5) /100;
            System.out.println(tax);
        }

        else if( salary>500000 && salary <=750000)
        {
            System.out.println("tax cut by 10% ");
             tax = (salary *10)/100;
            System.out.println(tax);
        }

        else if ( salary>750000 && salary<=1000000)
        {
            System.out.println("tax cut by 15%");
            tax = (salary *15)/100;
            System.out.println(tax);
        }
        else if (salary>1000000 && salary<=1250000)
        {
            System.out.println("tax deducted by 20%");
             tax = (salary * 20)/100;
            System.out.println(tax);
        }
        else if ( salary>1250000 && salary<=1500000)
        {
            System.out.println("tax deducted by 25%");
            tax=(salary*25)/100;
            System.out.println(tax);
        }
        else if (salary<0)
        {
            System.out.println("invalid salary entered");

        }
            System.out.println("tax for amount greater than 1500000 is 30%");
             tax = salary*30/100;
        System.out.println(tax);

    }
    public static void OldTax(double salary)
    {
        double tax;
        if(salary<0)
        {
            System.out.println("invalid amount entered");

        }
        if (salary>0 && salary<=250000)
        {
            System.out.println("No tax deducted");
        }
        else if (salary>250000 && salary<=500000)
        {
            tax=(salary *5)/100;
            System.out.println("tax amount deducted is 5% : "+tax);
        }
        else if(salary>500000 && salary <=1000000)
        {
            tax=(salary *20)/100;
            System.out.println("Tax amount deducted is 20%:"+tax);
        } else if (salary>1000000 )
        {
            tax=(salary *30)/100;
            System.out.println("tax amount deducted is 30% : "+tax);
        }


    }

    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("-----Enter your salary to calculate the tax amount deducted-----");
        double salary = s.nextDouble();
        System.out.println("Enter your choice to calculate 1. New tax Regime    2.Old tax regime");
        byte choice =s.nextByte();
        switch(choice)
        {
            case 1:
                OldTax(salary);
                break;
            case 2:
                NewTax(salary);
                break;
            default:
                System.out.println("wrong choice entered");
                break;
        }
        
    }
}
