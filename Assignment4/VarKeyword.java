package Assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class VarKeyword {
    public static void main(String[] args) {
        var name = "lavanya";
        System.out.println("String type name:" + name +"\n");

        var age = 21;
        System.out.println("int type age: " + age+"\n");

        System.out.println("\n");

        var map = new HashMap<String, Integer>();
        map.put("lavanya", 21);
        map.put("dhanashree", 22);
        map.put("chinmay", 23);
        System.out.println(map);
        //age="my age";//error as already we have used it to store some other type of data
        System.out.println("\n");
         var list = new ArrayList<Integer>();
        for (int i = 9; i < 20; i++)
        {
            list.add(i);

        }
        Iterator<Integer> it = list.iterator();
        System.out.println("elements of the list created using var keyword: ");
        while(it.hasNext())
        {
            Integer element = it.next();
            System.out.print(element+"  ");
        }
        System.out.println("\n");
    }
}
