package Assignment2;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList
{
    public static void main(String[] args)
    {
        ArrayList <Integer> myList =new ArrayList<>();
        long start1=System.currentTimeMillis();
        for(int i=0;i<200;i++)
        {
            myList.add(i);
        }

        System.out.println("List after adding all elements: "+myList);

        System.out.println("*******************************************************************");
        System.out.println("remove 5th element");
        myList.remove(5);
        System.out.println("element removed "+myList);
        System.out.println("after removal: "+myList);
        long end1=System.currentTimeMillis();
        System.out.println("time to do insertion in arraylist:"+(end1-start1));

        System.out.println("************************************************************************");
        System.out.println("Let's create a Linked list:)");
        LinkedList <Integer> linked = new LinkedList<>();
        long start2=System.currentTimeMillis();
       for(int i =100;i<=200;i++)
       {
           linked.add(i);
       }
        System.out.println("Linked list after adding all elements "+linked);
       linked.remove(5);
        System.out.println("element at 5th index removed from linked list");
        System.out.println(linked);
        long end2=System.currentTimeMillis();
        System.out.println("Time to do operations on linkedlist:"+(end2-start2));
    }
}
