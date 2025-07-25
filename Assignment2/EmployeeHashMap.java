package Assignment2;

import java.util.HashMap;

public class EmployeeHashMap
{
    public static void main(String[] args)
    {
        HashMap<Integer,String>employee=new HashMap<>();
        employee.put(101,"Lavanya");
        employee.put(102,"Abhi");
        employee.put(103,"Alankar");
        employee.put(104,"Om");
        employee.put(105,"dhanashree");
        System.out.println("original hashmap: \n");
        System.out.println(employee);
        System.out.println("After removal Hashmap:\n");
        employee.remove(101);
        System.out.println(employee);
        for( String s : employee.values())
        {
            System.out.print (s.charAt(0)=='A'?s :" ");
        }
        //iterating only through the values
        System.out.println(employee.values());


    }
}
