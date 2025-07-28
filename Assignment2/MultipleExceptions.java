package Assignment2;
import java.util.Scanner;
public class MultipleExceptions
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the numerator: ");
            String num = scanner.nextLine();

            //input a word here so that it doesn't get parsed to int
            System.out.print("Enter the denominator: ");
            String deno = scanner.nextLine();

            try
            {
                // Convert input strings to integers
                int numerator = Integer.parseInt(num);
                int denominator = Integer.parseInt(deno);

                // Perform division
                int result = numerator / denominator;
                System.out.println("Result of: " + numerator + " / " + denominator + " = " + result);
            }
            catch (ArithmeticException | NumberFormatException e)
            {
                // Handles both ArithmeticException and NumberFormatException
                if (e instanceof ArithmeticException)
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                else
                {
                    System.out.println("Error: Invalid input. Please enter valid numbers.");
                }
            }
            finally
            {
                // Always executed, regardless of exception
                System.out.println("Program execution completed.");
                scanner.close();
            }
        }

}
