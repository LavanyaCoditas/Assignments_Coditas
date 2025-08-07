package Assignment4;
record Data (String name, int age)
{

}
public class RecordClass
{

    public static void main(String[] args) {

        Data data1 = new Data("Sam", 10);

        System.out.println(data1.name() + " " + data1.age());

        System.out.println(data1);

        System.out.println(data1.hashCode());

        Data data2 = new Data("Sam", 10);
        Data data3 = new Data("Sam", 11);

        //.equals() returns true only if all the field/parameter values match.
        System.out.println(data1.equals(data2));
        System.out.println(data3.equals(data1));

        System.out.println(data2.getClass());

        System.out.println();
    }
}
//Write a record class to represent a Person with fields name and age, and demonstrate its usage.














//cannot extend other classes (but can implement interfaces).
