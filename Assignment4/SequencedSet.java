package Assignment4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SequencedSet {



        public static void main(String[] args) {
            LinkedHashSet<String> sequenceLinked =new  LinkedHashSet<>();
            sequenceLinked.add("apple");
            sequenceLinked.add("lichi");
            sequenceLinked.add("banana");
            sequenceLinked.add("dragon fruit");
            sequenceLinked.add("Peach");
            Iterator<String> it = sequenceLinked.iterator();
            while(it.hasNext())
            {
                String tempo= it.next();
                System.out.print(tempo+" ");
            }
            System.out.println("\n after insertion at first : ");
            sequenceLinked.addFirst("coffee");
            System.out.print(sequenceLinked+" ");
            System.out.println("\n AFter insertion at last : \n ");
            sequenceLinked.addLast(" java");
            System.out.print(" "+sequenceLinked);

            System.out.println("\n iterating in forward direction : \n");
            Iterator<String> iteratore = sequenceLinked.iterator();

            while(iteratore.hasNext())
            {
                String tempo= iteratore.next();
                System.out.print(tempo+" ");
            }

            System.out.println("\n iterating in reverse direction : ");
            Iterator<String> iterator1 = sequenceLinked.reversed().iterator();
            while (iterator1.hasNext())
            {
                String tempo = iterator1.next();
                System.out.print(tempo + " ");
            }


        }
    }


