package Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class SequencedCollection {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(21);
            list.add(22);
            list.add(23);
            list.add(24);
            System.out.println("Initial state of list: "+list);
            System.out.println("");
            System.out.println();
            list.addFirst(19);
            System.out.println("elements after adding at first:"+list);
            System.out.println("\n");
            list.addLast(299);
            System.out.println("elements after adding at last:"+list);
            System.out.println("\n");

            System.out.println("reversing the list"+list.reversed());
            System.out.println();
            for (Integer i : list)
            {
                System.out.println(i);
            }
            //using iterator forward traversal
            System.out.println("\n");
            Iterator<Integer> iterator =list.iterator();
            while (iterator.hasNext())
            {
                Integer i = iterator.next();
                System.out.println(i);
            }
            ListIterator<Integer> it = list.listIterator(list.size());
            System.out.println("reverse using iterator");
            while(it.hasPrevious())
            {
                Integer x = it.previous();
                System.out.println(x);
            }

        }
    }



