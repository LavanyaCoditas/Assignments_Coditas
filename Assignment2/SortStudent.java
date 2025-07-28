package Assignment2;

import java.util.ArrayList;

public class SortStudent
{
    public static void main(String[] args)
    {
        ArrayList <Studentdata> stud = new ArrayList<>();
        stud.add(new Studentdata("lavanya",21));
        stud.add(new Studentdata("Bhosale",22));
        stud.add(new Studentdata("Dhanashree",23));
        stud.add(new Studentdata("dhanu",25));
        stud.add(new Studentdata("Abhinandan",20));
        stud.add(new Studentdata("Sahil",19));
        System.out.println("Before sorting ");
        System.out.println(stud);
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("By age Sorting:");
        stud.sort((a,b)->Integer.compare(a.age,b.age ));
        System.out.println(stud);
        System.out.println("----------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("By Alphabetical Ordering of name Sorting: ");
        stud.sort((a,b)->Integer.compare(a.name.toLowerCase().charAt(0),b.name.toLowerCase().charAt(0)));
        System.out.println(stud);
        System.out.println("----------------------------------------------------------------------------------------------------------------------\n");


    }

}
class Studentdata
{
    String name;
    int age;
    public Studentdata(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString()
    {
        return "("+"name :"+name+", "+"age: "+age+")";
    }
}
