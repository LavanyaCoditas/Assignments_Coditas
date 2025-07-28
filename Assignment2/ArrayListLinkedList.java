package Assignment2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList
{
    public static void main(String[] args)
    {
        ArrayList <Integer> myList =new ArrayList<>();
        myList.add(1);
        myList.add(32);
        myList.add(8);
        myList.add(90);
        myList.add(900);
        myList.add(2);
        myList.add(81);
        myList.add(1);
        myList.add(211);
        myList.add(89);
        System.out.println("List after adding all elements: "+myList);
        System.out.println("*******************************************************************");
        System.out.println("remove 5th element");
        myList.remove(5);
        System.out.println("element removed "+myList);
        System.out.println("after removal: "+myList);

        System.out.println("************************************************************************");
        System.out.println("Let's create a Linked list:)");
        LinkedList <Integer> linked = new LinkedList<>();
       for(int i =100;i<=1000;i+=100)
       {
           linked.add(i);
       }
        System.out.println("Linked list after adding all elements "+linked);
       linked.remove(5);
        System.out.println("element at 5th index removed from linked list");
        System.out.println(linked);
    }
}
