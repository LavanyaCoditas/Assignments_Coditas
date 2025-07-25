package Assignment2;

public class DayEnum
{
    enum Day
    {
        Monday(0),
        Tuesday(1),
        Wednesday(2),
        Thrusday(3),
        Friday(4),
        Saturday(5),
        Sunday(6);

        private final int dayNum;


        Day(int dayNum)
        {
            this.dayNum=dayNum;

        }
        public int getDayNum()
        {

            return this.dayNum;
        }
        public Day Next()
        {
            int nextOrdinal= (this.ordinal()+1)%values().length;
            return values()[nextOrdinal];

        }
        public boolean isWeekend()
        {
           return this ==Saturday || this==Sunday;
        }
    }

    public static void main(String[] args) {
        System.out.println(Day.Monday.getDayNum());
        System.out.println(""+ Day.Sunday.Next());
           if(Day.Saturday.isWeekend())
           {
               System.out.println("yes");
           }

    }

}

