package Assignment4;
//use the enhanced switch statement to find number of days in th month entered by user
//Write a program that calculates the number of days in a given month using the new switch expression.
public class EnhancedSwitchDays
{
        public static String  dayType(String day)
        {
            String result= switch(day)
            {
                case "monday","tuesday","wednesday" -> "weekday";
                case "thrusday"->
                {
                    yield "weekday";
                }
                case "friday"->"weekend coming soon";
                default -> "weekend";
            };
            return result;
        }

        public static void main(String[] args) {
            String day="monday";
            System.out.println(dayType("monday"));
        }
    }


